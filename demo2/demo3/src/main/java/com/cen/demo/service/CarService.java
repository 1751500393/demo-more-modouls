package com.cen.demo.service;

import com.cen.demo.entity.Car;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CarService {
    /**
     * 根据uid查询Car集合
     *
     * @param uId 车主id
     * @return List<Car> 汽车集合
     */
    List<Car> getCarByUid(Integer uId);
}
