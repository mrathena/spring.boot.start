package com.mrathena.spring.boot.start.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mrathena.spring.boot.start.entity.SYSUser;

@Repository
public class SYSUserDaoImpl implements SYSUserDao {

	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<SYSUser> selectAll() {
		log.info("SYSUserDaoImpl.selectAll");
		return jdbc.query("select * from sys_user", new BeanPropertyRowMapper<SYSUser>(SYSUser.class));
	}

	@Override
	public int insert(SYSUser user) {
		log.info("SYSUserDaoImpl.insert");
		return jdbc.update("insert into sys_user(username, password, nickname) values (?, ?, ?)", user.getUsername(), user.getPassword(), user.getNickname());
	}

}