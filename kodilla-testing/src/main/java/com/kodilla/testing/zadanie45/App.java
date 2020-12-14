package com.kodilla.testing.zadanie45;

import java.util.LinkedList;

public class App {
    public static  void main(String[] args){


        LinkedList<Clock> list = new LinkedList<>();

        list.add(new Clock(23, 59, 06));
        list.add(new Clock(10, 11,15));
        list.add(new Clock(7,00,01));


        for(Clock time: list){
            System.out.println("Time before mod: " + time);
            time.addOneMinute();
            System.out.println("Time after mod: " + time);
        }


    }
}
