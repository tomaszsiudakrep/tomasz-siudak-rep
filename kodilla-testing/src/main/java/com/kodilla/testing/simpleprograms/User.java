package com.kodilla.testing.simpleprograms;

public class User extends App{

    private double age;
    private int height;

    public User(double age, int height, String name, boolean isGood) {
        super(name, isGood);
        this.age = age;
        this.height = height;
    }

    public void checkName() {
        System.out.println(getName());
    }
}
