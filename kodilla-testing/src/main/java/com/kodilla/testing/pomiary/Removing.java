package com.kodilla.testing.pomiary;

import java.util.ArrayList;
import java.util.List;

public class Removing {

    public void removingElements() {
        List<Integer> list = new ArrayList<>();

        for (int n = 0; n < 8000000; n++) {
            list.add(n);
        }

        System.out.println("Size of list: " + list.size());

        System.out.println("Removing last element..");
        long begin = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();
        System.out.println("Time to removine last element: " + (end - begin) + "ms!");

        System.out.println();

        System.out.println("Removing first element");
        long begin1 = System.currentTimeMillis();
        list.remove(0);
        long end1 = System.currentTimeMillis();
        System.out.println("Time to removing first element: " + (end1 - begin1) + "ms!");
    }
}
