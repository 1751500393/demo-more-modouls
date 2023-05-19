package com.cen.demo.controller;

import com.cen.demo.entity.Car;
import com.cen.demo.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@RequestMapping("/CarController")
@Api(tags = "Car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/get/{uId}")
    @ApiOperation(value = "find car list", response = Car.class, responseContainer = "List", httpMethod = "GET")
    public List<Car> getCars(@PathVariable Integer uId) {
        return carService.getCarByUid(uId);

    }
}
