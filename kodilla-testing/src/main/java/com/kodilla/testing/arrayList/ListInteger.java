package com.kodilla.testing.arrayList;

import java.util.ArrayList;

public class ListInteger {

    public void listInteger() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(15);

        System.out.println("Size of list = " + list.size());
        System.out.println(list.get(0));
    }
}
