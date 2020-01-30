package com.company.Abdi;

/**
 * Created by 102693 on 1/30/2020.
 */
public class Person {

    private String name;

    public Person(String name, String eyeColor, int age) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.age = age;
    }

    private String eyeColor;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
