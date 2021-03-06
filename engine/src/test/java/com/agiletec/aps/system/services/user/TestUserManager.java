/*
 * Copyright 2013-Present Entando Corporation (http://www.entando.com) All rights reserved.
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
package com.agiletec.aps.system.services.user;

import java.util.List;

import com.agiletec.aps.BaseTestCase;
import com.agiletec.aps.system.SystemConstants;

/**
 * @version 1.0
 * @author M.Casari
 */
public class TestUserManager extends BaseTestCase {
	
    protected void setUp() throws Exception {
        super.setUp();
        this.init();
    }
    
    public void testGetUsers() throws Throwable {
		List<UserDetails> users = this._userManager.getUsers();
		assertTrue(users.size()>=8);
    }
    
    //TODO FARE TEST PER OPERAZIONI SPECIALI SU UTENTE (VERIFICA DATE ACCESSI E CAMBIO PASSWORD)
    
    private void init() throws Exception {
    	try {
    		this._userManager = (IUserManager) this.getService(SystemConstants.USER_MANAGER);
		} catch (Throwable e) {
			throw new Exception(e);
		}
    }
    
    protected MockUser createUserForTest(String username) {
    	MockUser user = new MockUser();
		user.setUsername(username);
        user.setPassword("temp");
        return user;
	}
	
	private IUserManager _userManager = null;
	
}
