package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling extends Throwable {

    public static void main(String[] args) throws Throwable {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "No result";

        try{
            result = secondChallenge.probablyIWillThrowException(1.5, 1.0);
        } catch (Exception e){
            System.out.println("Error: " + e);
        } finally {
            System.out.println(result);
        }

    }

}


