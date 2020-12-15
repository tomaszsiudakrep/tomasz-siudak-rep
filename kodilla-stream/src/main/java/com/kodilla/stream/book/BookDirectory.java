package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {

    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("TomS", "Lord", 2002, "0001"));
        theBookList.add(new Book("EwaL", "Love", 2010, "0002"));
        theBookList.add(new Book("Tomsi", "Ziomsi", 2020, "0003"));
        theBookList.add(new Book("SW", "SW", 2021, "0004"));
    }

    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }

}
