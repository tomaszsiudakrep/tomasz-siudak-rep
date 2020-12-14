package com.kodilla.testing.arrayList;

import java.util.ArrayList;

public class BookList {

    public void bookArray() {

        Book book1 = new Book("Hobbit", 8.5, 2000);

        ArrayList<Book> listOfBooks = new ArrayList<>();

        listOfBooks.add(book1);
        System.out.println(listOfBooks);

    }
}
