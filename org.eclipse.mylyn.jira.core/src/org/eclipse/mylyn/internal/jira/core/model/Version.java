/*******************************************************************************
 * Copyright (c) 2007 Mylar committers and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Brock Janiczak - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylar.internal.jira.core.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author	Brock Janiczak
 */
public class Version implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String name;

	private boolean archived;

	private Date releaseDate;

	private boolean released;

	private long sequence;

	public boolean isArchived() {
		return this.archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isReleased() {
		return this.released;
	}

	public void setReleased(boolean released) {
		this.released = released;
	}

	public Date getReleaseDate() {
		return this.releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public long getSequence() {
		return this.sequence;
	}

	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (!(obj instanceof Version))
			return false;

		Version that = (Version) obj;

		return this.id.equals(that.id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode() {
		return id.hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name;
	}

	public static Version createMissingVersion(String name) {
		Version version = new Version();
		version.setName(name);
		return version;
	}
}