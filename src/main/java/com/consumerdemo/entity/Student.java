package com.consumerdemo.entity;

import java.io.Serializable;

/**
 * @desc：
 * @title：User
 * @author: huangwencai
 * @date: 2020-01-09 17:05
 * @version: v4.40.0
 */
public class Student implements Serializable {
    private int id;
    private String name;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}