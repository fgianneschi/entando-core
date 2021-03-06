/*
 * Copyright 2013-Present Entando S.r.l. (http://www.entando.com) All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package org.entando.entando.aps.system.services.storage.api;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "storageResource")
@XmlType(propOrder = {"name",  "directory", "base64", "protectedResource"})
public class JAXBStorageResource implements Serializable {


	@XmlElement(name = "name", required = false)
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}

	@XmlElement(name = "base64", required = false)
	public byte[] getBase64() {
		return _base64;
	}
	public void setBase64(byte[] base64) {
		this._base64 = base64;
	}
	

	@XmlElement(name = "directory", required = false)
	public boolean isDirectory() {
		return _directory;
	}
	public void setDirectory(boolean directory) {
		this._directory = directory;
	}

	@XmlElement(name = "protected", required = false)
	public boolean isProtectedResource() {
		return _protectedResource;
	}
	public void setProtectedResource(boolean protectedResource) {
		this._protectedResource = protectedResource;
	}

	private String _name;
	private boolean _protectedResource;
	private boolean _directory;
	private byte[] _base64;
}
