package com.kodilla.testing.zadanie2coma5;

import java.util.LinkedList;

public class ShowMeBooks {

    public Book2come5 book2come5;

    LinkedList<Book2come5> libraryOfBooks = new LinkedList<>();


    public void putBooks() {
        Book2come5 book1 = new Book2come5("Harry Potter", 2001);
        Book2come5 book2 = new Book2come5("Django", 1999);

        libraryOfBooks.add(book1);
        libraryOfBooks.add(book2);

        for (Book2come5 ksiazka: libraryOfBooks) {
            if(ksiazka.year >= 2000) {
                System.out.println(ksiazka.title);
            }
        }

    }
}
