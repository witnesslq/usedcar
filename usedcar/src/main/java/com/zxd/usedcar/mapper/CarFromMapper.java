package com.zxd.usedcar.mapper;

import com.zxd.usedcar.model.CarFrom;

public interface CarFromMapper {
    int deleteByPrimaryKey(Long cfId);

    int insert(CarFrom record);

    int insertSelective(CarFrom record);

    CarFrom selectByPrimaryKey(Long cfId);

    int updateByPrimaryKeySelective(CarFrom record);

    int updateByPrimaryKey(CarFrom record);
}