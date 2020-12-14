package com.kodilla.testing.kolekcje;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskManager {

    ArrayList<String> executedTask;

    public TaskManager(){
        executedTask = new ArrayList<>();
    }

    public void printEven(Deque<String> Queue){
        while(Queue.size() > 0){
            String task = Queue.poll();
            System.out.println("Procesing the task number: " + task);
            executedTask.add(task);
        }
        System.out.println("Total task: " + executedTask.size());
    }

}
