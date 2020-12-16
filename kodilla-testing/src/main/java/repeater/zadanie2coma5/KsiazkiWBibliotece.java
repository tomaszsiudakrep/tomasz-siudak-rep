package repeater.zadanie2coma5;

import java.util.LinkedList;

public class KsiazkiWBibliotece {

    KsiazkiDostepne ksiazkiDostepne;
    LinkedList<KsiazkiDostepne> listaKsiag = new LinkedList<>();

    KsiazkiDostepne ksiazka = new KsiazkiDostepne("Hobbit", 2020);
    KsiazkiDostepne ksiazka2 = new KsiazkiDostepne("Lord of the Ringd", 2003);
    KsiazkiDostepne ksiazka3 = new KsiazkiDostepne("Ania z zielonego wzgórza", 1995);

    public void dodawanieKsiazekDoListy() {
        listaKsiag.add(ksiazka);
        listaKsiag.add(ksiazka2);
        listaKsiag.add(ksiazka3);
    }

    public void pokazKsiazkiPo2000Roku() {
        for (KsiazkiDostepne zmiennaKsiazka: listaKsiag) {
            if(zmiennaKsiazka.getYear() > 2000) {
                System.out.println(zmiennaKsiazka);
            }
        }
    }
}
