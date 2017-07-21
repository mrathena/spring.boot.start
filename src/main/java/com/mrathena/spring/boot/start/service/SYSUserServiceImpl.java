package com.mrathena.spring.boot.start.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mrathena.spring.boot.start.dao.SYSUserMapper;
import com.mrathena.spring.boot.start.entity.SYSUser;

@Service
public class SYSUserServiceImpl implements SYSUserService {

	Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SYSUserMapper userDao;
	
	@Override
	public PageInfo<SYSUser> getAllUsers(Integer size, Integer index) {
		size = size == null ? 10 : size;
		index = index == null ? 1 : index;
		PageHelper.startPage(index, size);
		List<SYSUser> users = userDao.selectAll();
		return new PageInfo<SYSUser>(users, 9);
	}

	@Override
	public boolean insertUser(SYSUser user) {
		return userDao.insertSelective(user) != 0;
	}

	@Override
	public boolean deleteUser(Long userId) {
		return userDao.deleteByPrimaryKey(userId) != 0;
	}

}