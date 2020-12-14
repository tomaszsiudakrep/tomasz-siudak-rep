package com.kodilla.testing.grades;

import java.util.ArrayList;

public class AveragePartOne {

    ArrayList<Integer> theList = new ArrayList<>();
    private double result = 0;
    private double average;

    public void grades() {
        theList.add(2);
        theList.add(3);
        theList.add(4);
        theList.add(5);
        theList.add(6);
        theList.add(1);
        theList.add(1);
        theList.add(1);
    }

    public void removeFirstAndLast(){
        theList.remove(0);
        theList.remove(theList.size()-1);

    }

    public void average() {
        for(int n = 0; n < theList.size(); n++){

               result += theList.get(n);
        }

        average = result / theList.size();
        System.out.println(average);
    }
}
