package com.kodilla.testing.randomMethods;

import java.util.Random;

public class Application {
    public static void main(String [] args) {

        boolean loggedIn = false;
        int tryCounter = 0;

        Random random = new Random();

        while (!loggedIn) {
            tryCounter++;
            System.out.println("Waiting for the User to sign in.. [attempt: " + tryCounter + "]");

            if(random.nextInt(100) > 90) {
                loggedIn = true;
            };
        }
        System.out.println("User logged in");


    }
}
