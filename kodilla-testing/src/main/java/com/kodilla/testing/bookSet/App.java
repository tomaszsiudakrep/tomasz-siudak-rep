package com.kodilla.testing.bookSet;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        Book book = new Book("Hobbit", "TomaszS", 2011);
        Book book1 = new Book("Lord of the rings", "EwaL", 2002);
        Book book2 = new Book("Java.", "Javaaaa", 1993);

        HashSet<Book> books = new HashSet<>();
        books.add(book);
        books.add(book1);
        books.add(book2);

        for (Book book2010: books) {
            if(book2010.getYear() <= 2010) {
                System.out.println(book2010);
            }
        }


    }
}
