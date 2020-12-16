package com.kodilla.testing.sredniaOcen;

import java.util.ArrayList;
import java.util.Collections;

public class App {

    public static void main(String[] args) {

    //Part 1
        double sumaOcen = 0.0;
        int iloscOcenDoSrednie = 0;

        ArrayList<Double> oceny = new ArrayList<>();
        oceny.add(5.0);
        oceny.add(5.0);
        oceny.add(3.5);
        oceny.add(6.0);
        oceny.add(5.0);

        System.out.println("Najniższa ocena to: " + Collections.min(oceny) + " a jej indeks w liście = " + oceny.indexOf(Collections.min(oceny)) );
        System.out.println("Najwayższa ocena to: " + Collections.max(oceny) + " a jej indeks w liście = " + oceny.indexOf(Collections.max(oceny)));

        oceny.remove(Collections.min(oceny));
        oceny.remove(Collections.max(oceny));

        for (Double ocenaDoSredniej: oceny) {
            sumaOcen = sumaOcen + ocenaDoSredniej;
        }
        System.out.println(oceny.size());
        System.out.println("Srednia = " + sumaOcen / oceny.size());


//        for(int n = 0; n < oceny.size(); n++) {
//          if(oceny.indexOf(n) == oceny.indexOf(Collections.min(oceny)) || oceny.indexOf(n) == oceny.indexOf(Collections.max(oceny))) {
//
//              System.out.println("Min lub Max pomijamy");
//          } else {
//              sumaOcen = sumaOcen + oceny.get(n);
//              iloscOcenDoSrednie++;
//          }
//        }
    }
}
