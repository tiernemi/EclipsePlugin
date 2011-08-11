/*******************************************************************************
 * Copyright (c) 2007 Ryan Rusaw
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Ryan Rusaw
 *******************************************************************************/
package org.seisint.eclide.ast;

import org.eclipse.dltk.ast.expressions.Expression;

public class OctaveWhileStatement extends OctaveStatement {

	public OctaveWhileStatement(Expression expression, OctaveASTListNode list) {
		super();
		children.add(expression);
		children.addAll(list.getChilds());
	}

	public int getKind() {
		return S_WHILE;
	}

}
