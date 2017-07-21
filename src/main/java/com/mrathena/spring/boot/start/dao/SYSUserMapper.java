package com.mrathena.spring.boot.start.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mrathena.spring.boot.start.entity.SYSUser;

@Mapper
public interface SYSUserMapper {

	/** sys_user */
	int deleteByPrimaryKey(Long id);

	/** sys_user */
	int insert(SYSUser record);

	/** sys_user */
	int insertSelective(SYSUser record);

	/** sys_user */
	SYSUser selectByPrimaryKey(Long id);

	/** sys_user */
	int updateByPrimaryKeySelective(SYSUser record);

	/** sys_user */
	int updateByPrimaryKey(SYSUser record);
	
	List<SYSUser> selectAll();

}