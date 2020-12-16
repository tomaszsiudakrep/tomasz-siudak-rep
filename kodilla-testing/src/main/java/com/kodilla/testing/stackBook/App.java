//package com.kodilla.testing.stackBook;
//
//import java.util.ArrayDeque;
//
//public class App {
//
//    public static void main(String[] args) {
//
//        Book book = new Book("Lord","Tom", 2000);
//        Book book1 = new Book("Hobbit", "Ewa", 2001);
//
//        Order order = new Order(book, 2020, 5, 10);
//        Order order1 = new Order(book1, 2020, 10, 9);
//
//        ArrayDeque<Order> theOrder = new ArrayDeque<>();
//
//        theOrder.push(order);
//        theOrder.push(order1);
//        System.out.println("Size of stack: " + theOrder.size());
//
//        Order temporaryOrder;
//        temporaryOrder = theOrder.pop();
//        temporaryOrder = theOrder.pop();
//
//        System.out.println("New size of stack: " + theOrder.size());
//
//        System.out.println("Last deleted book: " + temporaryOrder);
//
//
//    }
//}
