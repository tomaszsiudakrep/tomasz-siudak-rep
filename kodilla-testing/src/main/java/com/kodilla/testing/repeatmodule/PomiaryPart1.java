package com.kodilla.testing.repeatmodule;

import java.util.LinkedList;

public class PomiaryPart1 {


    Ksiazka ksiazka2 = new Ksiazka("Author", "Title");

    LinkedList<Ksiazka> listaKsiazek = new LinkedList<>();

    public void dodawanieObiektow() {
        for(int n = 0; n < 1000000; n++) {
            listaKsiazek.add(n, ksiazka2);
        }
        System.out.println("Size of list: " + listaKsiazek.size());
    }

    public void removeFirstElement() {
        long time1 = System.nanoTime();
        listaKsiazek.remove(0);
        long time2 = System.nanoTime();
        System.out.println("Time: " + (time2 - time1));
    }

    public void removeLastElement() {
        long time3 = System.nanoTime();
        listaKsiazek.remove(listaKsiazek.size()-1);
        long time4 = System.nanoTime();
        System.out.println("Time: " + (time4 - time3));
    }

    public void addElementToFirstPosition() {
        long time5 = System.nanoTime();
        listaKsiazek.add(0, ksiazka2);
        long time6 = System.nanoTime();
        System.out.println("Time: " + (time6 - time5));
    }

    public void addElementToLastPosition() {
        long time7 = System.nanoTime();
        listaKsiazek.add(listaKsiazek.size(), ksiazka2);
        long time8 = System.nanoTime();
        System.out.println("Time: " + (time8 - time7));
    }
}
