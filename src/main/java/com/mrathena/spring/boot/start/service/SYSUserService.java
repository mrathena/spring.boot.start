package com.mrathena.spring.boot.start.service;

import com.github.pagehelper.PageInfo;
import com.mrathena.spring.boot.start.entity.SYSUser;

public interface SYSUserService {

	PageInfo<SYSUser> getAllUsers(Integer size, Integer index);
	
	boolean insertUser(SYSUser user);
	
	boolean deleteUser(Long userId);
	
}