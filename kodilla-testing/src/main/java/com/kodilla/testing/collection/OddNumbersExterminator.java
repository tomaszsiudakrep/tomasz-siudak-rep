package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;



public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();

        for(int number: numbers) {
            if(number % 2 == 0) {
                oddNumbers.add(number);
            } else {
                evenNumbers.add(number);
            }
        }

        return oddNumbers;

    }


}
