package com.kodilla.testing.racingSum;

import java.util.Random;

public class Numbers {

    int sumaA = 1000;
    int sumaB = 0;
    int a;
    int b;
    int tryCounter = 0;
    Random random = new Random();

    public void race() {

        while(sumaA > sumaB) {
            tryCounter++;
            System.out.println("Number of trying: " + tryCounter);
            a = random.nextInt(10);
            sumaA += a;
            b = random.nextInt(50);
            sumaB += b;
            System.out.println("SumaA = " + sumaA + "\nSumaB = " + sumaB);


        }

    }
}

