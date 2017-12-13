package com.zxd.usedcar.mapper;

import com.zxd.usedcar.model.Car;

public interface CarMapper {
    int deleteByPrimaryKey(Long cId);

    int insert(Car record);

    int insertSelective(Car record);

    Car selectByPrimaryKey(Long cId);

    int updateByPrimaryKeySelective(Car record);

    int updateByPrimaryKey(Car record);
}