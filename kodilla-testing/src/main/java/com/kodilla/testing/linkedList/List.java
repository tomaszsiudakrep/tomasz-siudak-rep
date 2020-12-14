package com.kodilla.testing.linkedList;

import java.util.LinkedList;

public class List {

    public String name;

    public void linkedList() {

        LinkedList<String> listOfBooks = new LinkedList<>();

        listOfBooks.add("Lord of the Rings");
        listOfBooks.add(0, "Hobbit");

        System.out.println(listOfBooks.get(0));
        name = listOfBooks.get(0);
        System.out.println(name);

    }

    public void fastList() {
        LinkedList<Integer> listFast = new LinkedList<>();

        for(int i = 0; i < 1000; i++) {
            listFast.add(i*2);
        }
        System.out.println("Element = " + listFast.get(760));

    }
}
