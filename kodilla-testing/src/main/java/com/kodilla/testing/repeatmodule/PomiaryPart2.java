package com.kodilla.testing.repeatmodule;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class PomiaryPart2 {

    HashMap<String, Ksiazka> mapaKsiazek = new HashMap();

    public void dodawanieElementowDoMapy() {
        for(int k = 0; k < 1000000; k++){
            mapaKsiazek.put("Klucz" + k, new Ksiazka("Author" + k, "Title" + k));

        }
        System.out.println("size of map: " + mapaKsiazek.size());
    }

    public void searchElement() {
        long time10 = System.nanoTime();
        mapaKsiazek.get("Klucz500000");
        long time11 = System.nanoTime();
        System.out.println("Looking a: " + mapaKsiazek.get("Klucz500000") + " time : " + (time11 - time10));
    }
}
