package com.kodilla.testing.repeatmodule;

import java.util.ArrayDeque;
import java.util.Random;

public class Part1 {

    ArrayDeque<String> listaA = new ArrayDeque<>();
    String a = "a";
    String value;
    Random random = new Random();

    public void toDoAString() {
        for(int n = 0 ; n < 50; n++) {
            int randomNumber = random.nextInt(50);
                for(int k = 0; k < randomNumber; k++){
                    //System.out.print(a);
                    value += a;
                }
           //System.out.println();
        listaA.offer(value);
        }
        System.out.println(listaA.size());
        System.out.println(listaA.getFirst());
    }
}
