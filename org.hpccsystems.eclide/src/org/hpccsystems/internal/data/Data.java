/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.internal.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationListener;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.hpccsystems.esp.Workunit;

public class Data extends Observable {
	private static Data singletonFactory;

	private Collection<LauncherPlatform> platforms;	
	private Collection<ClientTools> clientTools;	

	//  Singleton Pattern
	private Data() {
		platforms = new ArrayList<LauncherPlatform>();
		clientTools = new ArrayList<ClientTools>();

		//  Load platforms  ---
		ILaunchConfiguration[] configs;
		try {
			configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
			for(int i = 0; i < configs.length; ++i) {
				LauncherPlatform p = GetPlatform(configs[i]);
				if (p != null && !platforms.contains(p)) {
					platforms.add(p);
					ClientTools ct = ClientTools.get(p, configs[i]);
					if (!clientTools.contains(ct)) {
						clientTools.add(ct);
					}
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}

		//  Monitor platforms  ---
		DebugPlugin.getDefault().getLaunchManager().addLaunchConfigurationListener(new ILaunchConfigurationListener() {
			boolean mergeChanges() {
				boolean retVal = false;
				ILaunchConfiguration[] configs;
				try {
					configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations();
						//  Find new configs  ---
						for(int i = 0; i < configs.length; ++i) {
							Iterator<LauncherPlatform> itr = platforms.iterator(); 
							boolean found = false;
							while (itr.hasNext()) {
								LauncherPlatform platform = itr.next();
								if (platform.matches(configs[i])) {
									found = true;
									break;
								}
							}
							if (!found) {
								LauncherPlatform p = GetPlatform(configs[i]);
								if (p != null && !platforms.contains(p)) {
									platforms.add(p);
									retVal = true;
								}
							}
						}
						
						//  Find obsolete platforms  ---
						Iterator<LauncherPlatform> itr = platforms.iterator(); 
						while (itr.hasNext()) {
							boolean found = false;
							LauncherPlatform platform = itr.next();
							for(int i = 0; i < configs.length; ++i) {
								if (platform.matches(configs[i])) {
									found = true;
									break;
								}
							}
							if (!found) {
								LauncherPlatform.remove(platform);
								platforms.remove(platform);
								retVal = true;
							}
						}
				} catch (CoreException e) {
					e.printStackTrace();
				}
				return retVal;
			}

			@Override
			public void launchConfigurationRemoved(ILaunchConfiguration configuration) {
				if (configuration instanceof ILaunchConfigurationWorkingCopy)
					return;
				
				if (mergeChanges()) {
					setChanged();
					notifyObservers();
				}
			}

			@Override
			public void launchConfigurationChanged(ILaunchConfiguration configuration) {
				if (configuration instanceof ILaunchConfigurationWorkingCopy)
					return;

				if (mergeChanges()) {
					LauncherPlatform p = GetPlatformNoCreate(configuration);
					if (p != null) {
						p.clearTempDisabled();
					}
					setChanged();
					notifyObservers();
				}
			}

			@Override
			public void launchConfigurationAdded(ILaunchConfiguration configuration) {
				if (configuration instanceof ILaunchConfigurationWorkingCopy)
					return;

				if (mergeChanges()) {
					setChanged();
					notifyObservers();
				}
			}
		});

		setChanged();
	}

	public static synchronized Data get() {
		if (singletonFactory == null) {
			singletonFactory = new Data();
		}
		return singletonFactory;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	//  Platform  ---
	public LauncherPlatform GetPlatform(ILaunchConfiguration launchConfiguration, boolean noCreate) {
		LauncherPlatform retVal = null;
		boolean ssl = false;
		String ip = "";
		int port = 0;
		try {
			ssl = launchConfiguration.getAttribute(LauncherPlatform.P_SSL, false);
		} catch (CoreException e) {
		} 
		
		try {
			ip = launchConfiguration.getAttribute(LauncherPlatform.P_IP, "");
		} catch (CoreException e) {
		} 

		try {
			port = launchConfiguration.getAttribute(LauncherPlatform.P_PORT, 8010);
		} catch (CoreException e) {
		}

		if (port == 0) {
			port = 8010;
		}

		if (!ip.isEmpty() && port != 0) {
			if (noCreate) {
				retVal = LauncherPlatform.getNoCreate(ssl, ip, port);
			} else {
				retVal = LauncherPlatform.get(ssl, ip, port);
			}
			retVal.update(launchConfiguration);	
		}
		return retVal;
	}

	public LauncherPlatform GetPlatform(ILaunchConfiguration launchConfiguration) {
		return GetPlatform(launchConfiguration, false);
	}

	public LauncherPlatform GetPlatformNoCreate(ILaunchConfiguration launchConfiguration) {
		return GetPlatform(launchConfiguration, true);
	}

	public LauncherPlatform GetPlatformNoCreate(boolean ssl, String ip, int port) {
		return LauncherPlatform.getNoCreate(ssl, ip, port);
	}

	public final LauncherPlatform[] getPlatforms() {
		return platforms.toArray(new LauncherPlatform[0]);
	}

	public Collection<Workunit> getWorkunits(LauncherPlatform platform, boolean userOnly, String cluster, String startDate, String endDate) {
		return getWorkunits(platform, userOnly, cluster, startDate, endDate, "", "", "");
	}

	public Collection<Workunit> getWorkunits(LauncherPlatform platform, boolean userOnly, String cluster, String startDate, String endDate, String jobname) {
		return getWorkunits(platform, userOnly, cluster, startDate, endDate, jobname, "", "");
	}

	public Collection<Workunit> getWorkunits(LauncherPlatform platform, boolean userOnly, String cluster, String startDate, String endDate, String jobname, String appKey, String appValue) {
		Collection<Workunit> workunits = new HashSet<Workunit>();
		try {
			Workunit.All.pushTransaction("Data.getWorkunits");
			for (LauncherPlatform p : getPlatforms()) {
				assert p != null;
				if (platform == null || platform.equals(p)) {
					workunits.addAll(p.getWorkunits(userOnly, cluster, startDate, endDate, jobname, appKey, appValue));
				}
			}
		}
		finally {
			Workunit.All.popTransaction();
		}
		return workunits;
	}

	//  ClientTools  ---
	public ClientTools[] GetClientTools() {
		return clientTools.toArray(new ClientTools[0]);
	}
}
