package repeater.ogolnie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OcenyZIt {

    ArrayList<Double> ocenyIT = new ArrayList<>();
    Scanner inputGradesIT = new Scanner(System.in);
    private double sumaOcen = 0.0;


    public void dodajOcene() {
        for(int n =0; n < 4; n++) {
            System.out.println("Podaj ocenę z IT: ");
            ocenyIT.add(inputGradesIT.nextDouble());
        }
        System.out.println("Liczba ocen z IT: " + ocenyIT.size());
    }

    public void avgGradesIT() {
        System.out.println("Najmniejsza ocena: " + Collections.min(ocenyIT));
        ocenyIT.remove(Collections.min(ocenyIT));
        System.out.println("Najwieksza ocena: " + Collections.max(ocenyIT));
        ocenyIT.remove(Collections.max(ocenyIT));
        System.out.println("Liczba ocen do sredniej: " + ocenyIT.size());

        for(int n = 0; n < ocenyIT.size(); n++) {
            sumaOcen += ocenyIT.get(n);
        }
        System.out.println("Srednia = " + sumaOcen / ocenyIT.size());

    }
}
