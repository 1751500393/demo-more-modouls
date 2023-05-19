package com.cen.demo.service.imp;

import com.cen.demo.entity.Car;
import com.cen.demo.mapper.CarMapper;
import com.cen.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImp implements CarService {
    @Autowired
    private CarMapper carMapper;

    @Override
    public List<Car> getCarByUid(Integer uId) {
        return carMapper.selectCarByUid(uId);
    }
}
