package com.kodilla.testing.arrayList;

import java.util.ArrayList;

public class ListString {

    public void newStringList() {
        ArrayList<String> library = new ArrayList<>();

        library.add("Django");
        library.add("Superman");
        library.add("Hobbit");
        library.add(1, "Lord of the Rings");

        System.out.println(library);
        System.out.println("Size of library = " + library.size());
        library.remove(0);

        for(String book: library) {
            System.out.println(book);
        }
    }
}
