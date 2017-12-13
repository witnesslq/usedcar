package com.zxd.usedcar.mapper;

import com.zxd.usedcar.model.CarBrand;

public interface CarBrandMapper {
    int deleteByPrimaryKey(Long cbId);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    CarBrand selectByPrimaryKey(Long cbId);

    int updateByPrimaryKeySelective(CarBrand record);

    int updateByPrimaryKey(CarBrand record);
}