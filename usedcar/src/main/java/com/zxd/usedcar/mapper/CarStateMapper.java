package com.zxd.usedcar.mapper;

import com.zxd.usedcar.model.CarState;

public interface CarStateMapper {
    int deleteByPrimaryKey(Long csId);

    int insert(CarState record);

    int insertSelective(CarState record);

    CarState selectByPrimaryKey(Long csId);

    int updateByPrimaryKeySelective(CarState record);

    int updateByPrimaryKey(CarState record);
}