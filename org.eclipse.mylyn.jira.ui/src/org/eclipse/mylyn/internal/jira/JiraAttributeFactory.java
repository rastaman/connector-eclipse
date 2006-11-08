/*******************************************************************************
 * Copyright (c) 2004 - 2006 Mylar committers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.eclipse.mylar.internal.jira;

import org.eclipse.mylar.tasks.core.AbstractAttributeFactory;

/**
 * @author Mik Kersten
 */
public class JiraAttributeFactory extends AbstractAttributeFactory {

	private static final long serialVersionUID = 8000933300692372211L;

	@Override
	public boolean getIsHidden(String key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName(String key) {
		System.err.println(">>>> get: " + key);
		return key;
	}

	@Override
	public boolean isReadOnly(String key) {
		return false;
	}

	@Override
	public String mapCommonAttributeKey(String key) {
		return null;
	}

}