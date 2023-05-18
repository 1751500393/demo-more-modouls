package com.cen.demo.mapper;

import com.cen.demo.entity.Car;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarMapper {
    /**
     * 根据uid查询Car集合
     *
     * @param uId 车主id
     * @return List<Car> 汽车集合
     */
    List<Car> selectCarByUid(@Param("uId") Integer uId);
}
