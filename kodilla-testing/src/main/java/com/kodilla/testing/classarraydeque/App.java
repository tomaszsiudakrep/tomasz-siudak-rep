package com.kodilla.testing.classarraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main(String[] args) {

        Book book = new Book("Lord of the Rings", "Tomasz", 2000);
        Book book1 = new Book("Hobbit", "EwaL", 2002);
        Book book2 = new Book("HarryPotter", "Ewcia", 2005);

        Order order = new Order(book, 2020, 6, 25);
        Order order1 = new Order(book1, 2020, 9, 9);
        Order order2 = new Order(book2, 2020, 8, 30);

        Deque<Order> theOrders = new ArrayDeque<>();
        System.out.println("Size of theOrders: " + theOrders.size());

        theOrders.offer(order);
        theOrders.offer(order1);
        theOrders.offer(order2);
        System.out.println("New size: " + theOrders.size());

        System.out.println(theOrders.peek());

        Order temporaryOrder;
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();
        temporaryOrder = theOrders.poll();

        System.out.println("Final size: " + theOrders.size());

        System.out.println(temporaryOrder);


    }
}
