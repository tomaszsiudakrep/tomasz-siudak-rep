package repeater.zadanie2coma5;

import java.util.ArrayList;
import java.util.Collections;

public class SkrajneUsuwamy {

    ArrayList<Double> listaOcenIT = new ArrayList<>();
    double sredniaOcenZIT;
    double sumaOcenZIT = 0.0;

    public void wstawianieOcenDoListy() {
        listaOcenIT.add(5.0);  // najwieksza pomijana
        listaOcenIT.add(5.0);
        listaOcenIT.add(4.5);
        listaOcenIT.add(3.0);  // najmniejsza pomijana
        listaOcenIT.add(4.0);

        System.out.println("Liczba ocen: " + listaOcenIT.size());
    }

    public void SearchAndRemoveExtreme() {
        System.out.println("Największa ocena to: " + Collections.max(listaOcenIT));
            listaOcenIT.remove(Collections.max(listaOcenIT));
        System.out.println("Najmniejsza ocena to: " + Collections.min(listaOcenIT));
            listaOcenIT.remove(Collections.min(listaOcenIT));
        System.out.println("Liczba ocen na liście: " + listaOcenIT.size());



    }

    public void obliczenieSredniejOcenIT() {
        for (Double ocena: listaOcenIT) {
            sumaOcenZIT += ocena;
        }

        sredniaOcenZIT = sumaOcenZIT / listaOcenIT.size();
        System.out.println("Srednia ocen z IT = " + sredniaOcenZIT);
    }
}
