package com.mrathena.spring.boot.start.service;

import java.util.List;

import com.mrathena.spring.boot.start.entity.SYSUser;

public interface SYSUserService {

	List<SYSUser> getAllUsers();
	
	boolean insertUser(SYSUser user);
	
}