package com.kodilla.testing.classarraydeque;

import java.time.LocalDate;

public class Order {
    Book book;
    LocalDate dateOfOrder;

    public Order(Book book, int year, int month, int day) {
        this.book = book;
        this.dateOfOrder = LocalDate.of(year, month, day);
    }

    @Override
    public String toString() {
        return "Order{" +
                "book=" + book +
                ", dateOfOrder=" + dateOfOrder +
                '}';
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }


}
