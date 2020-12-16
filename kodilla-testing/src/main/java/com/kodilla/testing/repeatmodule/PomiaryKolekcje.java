package com.kodilla.testing.repeatmodule;

import java.util.ArrayList;

public class PomiaryKolekcje {

    ArrayList<Integer> listaInt = new ArrayList<>();

    public void uzupelnienieListy() {
        for(int n = 0; n < 8000000; n++) {
            listaInt.add(n);
        }
        System.out.println(listaInt.size());

    }

    public void removeLastElement() {
        long momentOfTimeBegin = System.currentTimeMillis();
        listaInt.remove(listaInt.size()-1);
        long momentOfTimeEnd = System.currentTimeMillis();

        System.out.println("Czas: " + (momentOfTimeEnd - momentOfTimeBegin) + "ms");

        long momentBegin = System.nanoTime();
        listaInt.remove(listaInt.size()-1);
        long momentEnd = System.nanoTime();

        System.out.println("Czas: " + (momentEnd - momentBegin) + "ns");
    }

    public void removeElementOfMilions() {
        long begin = System.nanoTime();
        listaInt.remove(listaInt.size()-1);
        long end = System.nanoTime();
        System.out.println("Czas: " + (end - begin) + "ns");

        long beginFirst = System.nanoTime();
        listaInt.remove(0);
        long endFirst = System.nanoTime();
        System.out.println("Czas: " + (endFirst - beginFirst) + "ns");
    }

    public void timeToAddElements() {

        long time1 = System.nanoTime();
        listaInt.add(0, 500);
        long time2 = System.nanoTime();
        System.out.println("Czas: " + (time2 - time1) + "ns");

        long time3 = System.nanoTime();
        listaInt.add(listaInt.size(), 100);
        long time4 = System.nanoTime();
        System.out.println("Czas: " + (time4 - time3) + "ns");
    }


}
