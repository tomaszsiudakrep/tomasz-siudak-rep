package com.kodilla.testing.pomiarSzybkosciLinledIHash;

import java.util.HashMap;
import java.util.LinkedList;

public class App {

    public static void main(String[] args){

        LinkedList<Book> list = new LinkedList<>();

        for(int n = 0; n < 200000; n++){
            list.add(new Book("LordOfTheRing " + n, "XYZ " + n));
        }

        System.out.println("Start part 1........... \n");
        System.out.println("Removing first element..");
        long begin = System.nanoTime();
        list.remove(0);
        long end = System.nanoTime();
        System.out.println("Time: " + (end - begin));

        System.out.println("Removing last element");
        long begin1 = System.nanoTime();
        list.remove(list.size()-1);
        long end1 = System.nanoTime();
        System.out.println("Time: " + (end1 - begin1));

        System.out.println("Adding new element on the begin..");
        long begin2 = System.nanoTime();
        list.add(0,new Book("XXX", "YYY"));
        long end2 = System.nanoTime();
        System.out.println("Time: " + (end2 - begin2));

        System.out.println("Adding new element on the end");
        long begin3 = System.nanoTime();
        list.add(list.size(),new Book("ZZZ", "CCC"));
        long end3 = System.nanoTime();
        System.out.println("Time: " + (end3 - begin3) + "\n");

        System.out.println("Start part 2..........\n");

        HashMap<String, Book> map = new HashMap();

        for(int n = 0; n< 200000; n++){
            map.put("xyz" + n,new Book("Hobbit" + n, "Tom" + n));
        }

        System.out.println("Searching a object....");
        long begin4 = System.nanoTime();
        map.get("xyz100000");
        long end4 = System.nanoTime();
        System.out.println("Time: " + (end4 - begin4));

        System.out.println("Adding a new element to map");
        long begin5 = System.nanoTime();
        map.put("xxx", new Book("TOm", "Tom"));
        long end5 = System.nanoTime();
        System.out.println("Time: " + (end5 - begin5));

        System.out.println("Removing a element");
        long begin6 = System.nanoTime();
        map.remove("xxx");
        long end6 = System.nanoTime();
        System.out.println("Time: " + (end6 - begin6));



    }
}
