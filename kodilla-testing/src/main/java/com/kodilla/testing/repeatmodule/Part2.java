package com.kodilla.testing.repeatmodule;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Part2 {

    ArrayList<String> evenList = new ArrayList<>();
    ArrayList<String> oddsList = new ArrayList<>();


    public void division(ArrayDeque<String> listaA) {
        int lengthOfString;
        int modulo;

        for(int n = 0; n < 50; n++) {
            String object = listaA.poll();
            lengthOfString = object.length();
            modulo = lengthOfString % 2;

            if(modulo == 0) {
                evenList.add(object);
            } else {
                oddsList.add(object);
            }
        }

        System.out.println("Even: " + evenList.size());
        System.out.println("Odds: " + oddsList.size());
    }
}
