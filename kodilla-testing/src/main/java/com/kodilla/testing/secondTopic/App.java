package com.kodilla.testing.secondTopic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        LinkedList<Integer> liczby = new LinkedList<>();
//
//        for(int n = 0; n < 1000; n++) {
//            liczby.add(n*2);
//
//        }
//        System.out.println(liczby.get(750));


        List<String> userNames = new LinkedList<>();

        userNames.add("Tomasz");
        userNames.add("Ewa");
        userNames.add("Tomek");

        for (String name: userNames) {
            if(name.length() < 6) {
                System.out.println(name);
            }
        }




//        ArrayList<String> library = new ArrayList<>();   //################## ARRAY LISTY TYPU STRING

//        library.add("Django");
//        library.add("8");
//        library.add("Harry Potter");
//        library.add("Better Call Saul");
//        library.add("Przyjaciele");
//        library.add("Breaking Bad");
//
//
//        for (String video: library) {
//            System.out.println(video);
//        }
//        System.out.println("Wielkość listy: " + library.size());


//        ArrayList<Integer> numbers = new ArrayList<>(); //################## ARRAY LISTY TYPU INTEGER
//        int value = 0;
//        for (int n = 0; n <= 20; n++) {
//            numbers.add(value);
//            System.out.println(numbers.get(n));
//            value = value + 10;
//        }
//
//        System.out.println("Wielkość listy = " + numbers.size());
//
//        System.out.println(numbers.get(5));
//
//        numbers.remove(5);
//        System.out.println(numbers.get(5));
//
//        numbers.add(5, 99999);
//        System.out.println(numbers.get(5));

        //########################################################### ARRAY LISTY TYPU OBIEKTÓW BOOK
//        Book book;
//
//        ArrayList<Book> libraryGibza = new ArrayList<>();
//
//        Book book1 = new Book("LifeStyle", "Gibon", 2021);
//        Book book2 = new Book("LifeStyleEwc", "Ewcia", 2021);
//
//        libraryGibza.add(book1);
//        libraryGibza.add(book2);
//
//        System.out.println("Wielkość biblioteki gibza: " + libraryGibza.size());


    }
}
