package com.richard;


import com.richard.annotation.BuilderProperty;

public class Client {

    private int age;
    private String name;
    private String test;


    public int getAge() {
        return age;
    }

    @BuilderProperty
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @BuilderProperty
    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    @BuilderProperty
    public void setTest(String test) {
        this.test = test;
    }
}
