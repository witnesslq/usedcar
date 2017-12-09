package com.zxd.usedcar.mapper;

import org.mybatis.spring.annotation.MapperScan;

import com.zxd.usedcar.model.User;

@MapperScan
public interface UserMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}