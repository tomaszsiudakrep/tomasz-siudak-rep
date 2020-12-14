package com.kodilla.testing.kolekcje;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class App {
    public static void main(String[] args) {

        Deque<String> theQueue1 = new ArrayDeque<>();
        for(int n = 0; n < 5; n++){
            theQueue1.offer("First array - Task number: " + (n+1));
        }

        Deque<String> theQueue2 = new ArrayDeque<>();
        for(int n = 0; n < 5; n++){
            theQueue2.offer("Second array - Task number: " + (n+1));
        }
        TaskManager taskManager = new TaskManager();
        taskManager.printEven(theQueue1);
        taskManager.printEven(theQueue2);

    }
}
