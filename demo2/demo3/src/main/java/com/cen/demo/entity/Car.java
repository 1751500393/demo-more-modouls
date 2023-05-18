package com.cen.demo.entity;

import lombok.Data;

@Data
public class Car {
    /**
     * 购物车id
     */
    private Integer carId;

    /**
     * 购物车名字
     */
    private String carName;

    /**
     * 用户名字
     */
    private Integer uId;
}

