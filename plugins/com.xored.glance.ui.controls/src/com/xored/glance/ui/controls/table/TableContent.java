/*******************************************************************************
 * Copyright (c) 2012 xored software, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc. - initial API and implementation (Yuri Strot)
 ******************************************************************************/
package com.xored.glance.ui.controls.table;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.swt.widgets.Table;

import com.xored.glance.ui.controls.decor.IPath;
import com.xored.glance.ui.controls.decor.IStructContent;
import com.xored.glance.ui.controls.decor.StructCell;
import com.xored.glance.ui.sources.ITextBlock;
import com.xored.glance.ui.sources.ITextSourceListener;

public class TableContent implements IStructContent {

	private final ListenerList listeners = new ListenerList();

	public TableContent(Table table) {
	}

	public void addListener(ITextSourceListener listener) {
		listeners.add(listener);
	}

	public void removeListener(ITextSourceListener listener) {
		listeners.remove(listener);
	}

	public ITextSourceListener[] getListeners() {
		Object[] objects = listeners.getListeners();
		ITextSourceListener[] listeners = new ITextSourceListener[objects.length];
		System.arraycopy(objects, 0, listeners, 0, objects.length);
		return listeners;
	}

	public void dispose() {
	}

	public ITextBlock[] getBlocks() {
		return null;
	}

	public ITextBlock getContent(StructCell cell) {
		return null;
	}

	public IPath getPath(ITextBlock block) {
		return null;
	}

	public void index(IProgressMonitor monitor) {
		monitor.done();
	}

}
