package com.kodilla.testing.simpleprograms;

public class App {
    private String name;
    private boolean isGood;

    public App(String name, boolean isGood) {
        this.name = name;
        this.isGood = isGood;
    }

    public String getName() {
        return this.name;
    }



    public void check(String name, boolean isGood) {
        if(name == "Tomasz" && isGood) {
            System.out.println("Good!");
        } else {
            System.out.println("You will be!");
        }
    }
}
