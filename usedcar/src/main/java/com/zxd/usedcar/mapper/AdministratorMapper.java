package com.zxd.usedcar.mapper;

import com.zxd.usedcar.model.Administrator;

public interface AdministratorMapper {
    int deleteByPrimaryKey(Long aId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Long aId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}