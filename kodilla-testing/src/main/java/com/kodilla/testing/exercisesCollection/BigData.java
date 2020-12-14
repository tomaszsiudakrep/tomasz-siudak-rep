package com.kodilla.testing.exercisesCollection;

import java.util.ArrayList;
import java.util.Random;

public class BigData {

    public void printEven(ArrayList<Integer> theList){
        int value = 0;

       for(int n = 0; n < theList.size(); n++){
           value = theList.get(n);

           if(value % 2 == 0){
               System.out.println(value);
           }
       }
    }

}
