package com.samlltest.lib.utils;

import java.io.Serializable;

/**
 * Created by android on 2017/8/3.
 * Small
 */
public class Body implements Serializable {

    public static final String BODY_EXTRA = "body_extra";

    private String name;
    private String addr;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
