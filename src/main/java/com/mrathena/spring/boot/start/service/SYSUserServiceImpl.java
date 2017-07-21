package com.mrathena.spring.boot.start.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrathena.spring.boot.start.dao.SYSUserMapper;
import com.mrathena.spring.boot.start.entity.SYSUser;

@Service
public class SYSUserServiceImpl implements SYSUserService {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SYSUserMapper userDao;
	
	@Override
	public List<SYSUser> getAllUsers() {
		log.info("SYSUserServiceImpl.getAllUsers");
		return userDao.selectAll();
	}

	@Override
	public boolean insertUser(SYSUser user) {
		log.info("SYSUserServiceImpl.insertUser");
		return userDao.insertSelective(user) != 0;
	}

	@Override
	public boolean deleteUser(Long userId) {
		log.info("SYSUserServiceImpl.deleteUser");
		return userDao.deleteByPrimaryKey(userId) != 0;
	}

}