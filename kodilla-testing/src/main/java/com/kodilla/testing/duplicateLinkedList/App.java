package com.kodilla.testing.duplicateLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class App {

    public static void main(String[] args){

        LinkedList<DuplicateObject> listOfNumbers = new LinkedList<>();
        Random random = new Random();

        for(int n = 0; n < 100; n++){
            listOfNumbers.add(new DuplicateObject(random.nextInt(100)));
        }

        Iterator<DuplicateObject> iterator = listOfNumbers.iterator();

        while(iterator.hasNext()){
            DuplicateObject examinedObject = iterator.next();

            for(int n = 0; n < listOfNumbers.size(); n++) {


                if(listOfNumbers.get(n).hashCode() != examinedObject.hashCode()){

                    if(listOfNumbers.get(n).equals(examinedObject)) {
                        System.out.println("Duplicated " + examinedObject.getValue());
                    }
                }
            }
        }

    }
}
