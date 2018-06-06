package com.zwy.dagger2;

/**
 * Created by zwy on 2017/11/8.
 * email:16681805@qq.com
 */

public class User {
    private String name;
    private int age;

    //告诉Component这是它的一个手下
    public User() {
        this.name = "jack";
        this.age = 80;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
