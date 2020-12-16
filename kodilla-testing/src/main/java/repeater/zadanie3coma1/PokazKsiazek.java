package repeater.zadanie3coma1;

import java.util.HashSet;
import java.util.Map;

public class PokazKsiazek {

    KsiazkiLibrary ksiazkiLibrary;

    HashSet<KsiazkiLibrary> ksiazki = new HashSet<>();

    public void dodajKsiazke() {
        KsiazkiLibrary ksiazka = new KsiazkiLibrary("X", "Y", 2000);
        KsiazkiLibrary ksiazka1 = new KsiazkiLibrary("Ewcia","Moja", 2011);
        KsiazkiLibrary ksiazka2 = new KsiazkiLibrary("Jestem", "Sobą", 2021);

        ksiazki.add(ksiazka);
        ksiazki.add(ksiazka1);
        ksiazki.add(ksiazka2);

        System.out.println("Rozmiar hash setu: " + ksiazki.size());
    }

    public void pokazJakieMaszKsiazki() {
        for (KsiazkiLibrary entry: ksiazki) {
            if(entry.getRokWydania() < 2010) {
                System.out.println(entry);
            }
        }
    }

}
