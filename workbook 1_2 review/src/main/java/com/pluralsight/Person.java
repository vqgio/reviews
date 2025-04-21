package com.pluralsight;

public class Person {
    private String name;

    private int age;
    //setter and getters
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
        if (age >= 0) this.age = age;
    }
}
