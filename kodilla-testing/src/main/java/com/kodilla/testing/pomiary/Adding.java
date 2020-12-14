package com.kodilla.testing.pomiary;

import java.util.ArrayList;

public class Adding {

    public void addingElements() {

        ArrayList<Integer> list2 = new ArrayList<>();

        for(int n=0; n<8000000; n++){
            list2.add(n);
        }

        System.out.println("Size of list2: " + list2.size());

        System.out.println("Add new element to begin list");
        long begin = System.nanoTime();
        list2.add(0, 500);
        long end = System.nanoTime();
        System.out.println("Time to add a new element: " + (begin - end) + "ms");

        System.out.println("Add new element to end list");
        long begin2 = System.nanoTime();
        list2.add(list2.size(), 500);
        long end2 = System.nanoTime();
        System.out.println("Time to add a new element" + (begin2 - end2));
    }
}
