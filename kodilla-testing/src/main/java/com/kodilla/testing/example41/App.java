package com.kodilla.testing.example41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class App {
    public static void main(String[] args){

        HashMap<Integer, String> myFavouriteColors = new HashMap<>();
        HashMap<Integer, String> myFriendsFavColors = new HashMap<>();

        myFavouriteColors.put(1, "Red");
        myFavouriteColors.put(2, "Green");
        myFavouriteColors.put(3, "Black");

        myFriendsFavColors.put(4, "White");
        myFriendsFavColors.put(5, "Blue");
        myFriendsFavColors.put(6, "Orange");

        HashMap<Integer, String> ourFavColors = new HashMap<>();

        for(int n = 0; n < myFavouriteColors.size(); n++){
            ourFavColors.put(n, myFavouriteColors.get(n+1));
        }

        for(int i = 0; i < myFriendsFavColors.size(); i++){
            ourFavColors.put(i+3, myFriendsFavColors.get(i+1));
        }



        System.out.println(ourFavColors.size());

    }
}
