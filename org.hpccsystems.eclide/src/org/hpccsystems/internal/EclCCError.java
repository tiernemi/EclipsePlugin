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
package org.hpccsystems.internal;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.Path;

public class EclCCError extends CError {
	EclCCError(String errorLine) {
		severity = IMarker.SEVERITY_INFO;
		errorPath = null;
		lineNumber = 0;
		colNumber = 0;
		String[] parts = errorLine.split(":\\p{Blank}");
		if (parts.length >= 3) {
			String filePathAndLoc = parts[0];
			int endFilePathPos = filePathAndLoc.lastIndexOf("(");			
			if (endFilePathPos > -1 && filePathAndLoc.endsWith(")")) {
				errorPath = new Path(filePathAndLoc.substring(0, endFilePathPos));
				String[] posParts = filePathAndLoc.substring(endFilePathPos).split("[\\(,\\)]");
				if (posParts.length >= 2) {
					String line = posParts[posParts.length - 2];
					String col = posParts[posParts.length - 1];

					try {
						lineNumber = Integer.parseInt(line);
					} catch (NumberFormatException e) {
					}
					try {
						colNumber = Integer.parseInt(col);
					} catch (NumberFormatException e) {
					}
				}
			} else {
				errorPath = new Path(filePathAndLoc);
			}
			String[] codeParts = parts[1].split(" ");
			if (codeParts.length >= 1) {
				if (codeParts[0].equalsIgnoreCase("error")) {
					severity = IMarker.SEVERITY_ERROR;
				} else if (codeParts[0].equalsIgnoreCase("warning")) {
					severity = IMarker.SEVERITY_WARNING;
				} else {
					severity = IMarker.SEVERITY_INFO;
				}
			}
			if (codeParts.length >= 2) {
				code = codeParts[1];
			}
			message = parts[2];
			valid = true;
		}
	}
}
