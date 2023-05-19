package com.cen.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "details about the car")
public class Car {
    /**
     * 购物车id
     */
    @ApiModelProperty(notes = "the unique ID of the car")
    private Integer carId;

    /**
     * 购物车名字
     */
    @ApiModelProperty(notes="the car brand")
    private String carName;

    /**
     * 用户名字
     */
    @ApiModelProperty(notes = "the car host")
    private Integer uId;
}

