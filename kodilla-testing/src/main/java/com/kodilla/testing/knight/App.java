package com.kodilla.testing.knight;

public class App {

    public static void main(String[] args) throws java.lang.Exception {

        Knight knight = new Knight(new DeadIslandQuest());
        Knight knight1 = new Knight(new EliteKnightQuest());

        knight.runQuest();
        System.out.println();
        knight1.runQuest();
    }
}
