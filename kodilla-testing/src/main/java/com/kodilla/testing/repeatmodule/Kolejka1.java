package com.kodilla.testing.repeatmodule;

import java.util.ArrayDeque;
import java.util.Random;

public class Kolejka1 {

    ArrayDeque<String> listaDeque = new ArrayDeque<>();
    char letterA = 'a';
    String newString = "";
    Random randomNr = new Random();

    public void toDoPart1() {
        for(int n = 0; n < 50; n++){
            int wylosowanaLiczba = randomNr.nextInt(50);
                for(int k = 0; k < wylosowanaLiczba; k++){
                    newString += letterA;
                }
            listaDeque.offer(newString);
        }

        System.out.println(listaDeque.size());
        System.out.println(listaDeque);
    }

}
