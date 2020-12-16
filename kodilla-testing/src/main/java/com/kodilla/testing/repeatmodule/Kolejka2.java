package com.kodilla.testing.repeatmodule;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Kolejka2 {

    ArrayList<String> parzyste = new ArrayList<>();
    ArrayList<String> nieparzyste = new ArrayList<>();

    int modulo;
    String text;

    public void toDoPart2(ArrayDeque<String> listaDeque) {
        for(int n = 0; n < 50; n++){
            String text = listaDeque.poll();
            modulo = text.length();
                if(modulo % 2 == 0) {
                    parzyste.add(text);
                } else {
                    nieparzyste.add(text);
                }

        }
        System.out.println("Even: " + parzyste.size());
        System.out.println("Odds: " + nieparzyste.size());
    }
}
