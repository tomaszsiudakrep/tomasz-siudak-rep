package com.kodilla.exception.test;

public class ExceptionHandling extends Throwable {

    public static void main(String[] args) throws ExceptionHandling {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "No result";

        try{
            result = secondChallenge.probablyIWillThrowException(1.5, 1.5);
        } catch (Exception e){
            System.out.println("Error: " + e);
        } finally {
            System.out.println(result);
        }

    }

}
