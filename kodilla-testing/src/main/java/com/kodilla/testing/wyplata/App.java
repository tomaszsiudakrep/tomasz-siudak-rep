package com.kodilla.testing.wyplata;

public class App {

    public static void main(String[] args) {

        StalaPensja stalaPensja = new StalaPensja(5000, false, 20);

        GodzinowaPensja godzinowaPensja = new GodzinowaPensja(210, 10);

        Bank bank = new Bank(godzinowaPensja);
        bank.robPrzelew();
    }
}
