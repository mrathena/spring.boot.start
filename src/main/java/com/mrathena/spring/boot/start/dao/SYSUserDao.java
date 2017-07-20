package com.mrathena.spring.boot.start.dao;

import java.util.List;

import com.mrathena.spring.boot.start.entity.SYSUser;

public interface SYSUserDao {

	List<SYSUser> selectAll();
	
	int insert(SYSUser user);
	
}