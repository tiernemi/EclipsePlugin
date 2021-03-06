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
package org.hpccsystems.eclide.perspectives;

import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;


/**
 *  This class is meant to serve as an example for how various contributions 
 *  are made to a perspective. Note that some of the extension point id's are
 *  referred to as API constants while others are hardcoded and may be subject 
 *  to change. 
 */
public class ECLPerspective implements IPerspectiveFactory {

	public static final String PERSPECTIVE_ID = "org.hpccsystems.eclide.perspectives.ECLPerspective";

	private IPageLayout layout;

	public ECLPerspective() {
		super();
	}

	@Override
	public void createInitialLayout(IPageLayout layout) {
		this.layout = layout;
		addViews();
		addActionSets();
		addNewWizardShortcuts();
		addPerspectiveShortcuts();
		addViewShortcuts();
	}

	private void addViews() {
		// Creates the overall folder layout. 
		// Note that each new Folder uses a percentage of the remaining EditorArea.
		String editorArea = layout.getEditorArea();

		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.25f, editorArea);
		left.addView("org.hpccsystems.eclide.viewWorkunits");
		IFolderLayout bottomLeft = layout.createFolder( "bottomLeft", IPageLayout.BOTTOM, 0.25f, "left");
		bottomLeft.addView("org.hpccsystems.eclide.navigator");

		IFolderLayout bottom = layout.createFolder("bottomRight", IPageLayout.BOTTOM, 0.75f, editorArea);
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);

		IFolderLayout right = layout.createFolder("right", IPageLayout.RIGHT, 0.75f, editorArea);
		right.addView(IPageLayout.ID_OUTLINE);
	}

	private void addActionSets() {
		layout.addActionSet("org.eclipse.debug.ui.launchActionSet"); 
		layout.addActionSet(JavaUI.ID_ACTION_SET);
	}

	private void addPerspectiveShortcuts() {
		layout.addPerspectiveShortcut(ECLPerspective.PERSPECTIVE_ID); 
		layout.addPerspectiveShortcut(ECLWatch.PERSPECTIVE_ID); 
	}

	private void addNewWizardShortcuts() {
		layout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder");
		layout.addNewWizardShortcut("org.hpccsystems.eclide.wizards.ECLNewFileWizard");
	}

	private void addViewShortcuts() {
		layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
		layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
	}

}
