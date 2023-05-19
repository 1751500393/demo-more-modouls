package com.cen.demo.controller;

import com.cen.demo.entity.Car;
import com.cen.demo.service.CarService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
@RestController
@RequestMapping("/CarController")
@Api(tags = "Car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/get")
    @ApiOperation(value = "find car list" )
    public List<Car> getCars(@RequestParam Integer uId) {

        return carService.getCarByUid(uId);

    }
}
