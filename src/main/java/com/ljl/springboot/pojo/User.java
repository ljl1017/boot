package com.ljl.springboot.pojo;

import lombok.Data;
import lombok.Value;

@Value
public class User {
    private String name;
    private int age;
    private String sex;
}
