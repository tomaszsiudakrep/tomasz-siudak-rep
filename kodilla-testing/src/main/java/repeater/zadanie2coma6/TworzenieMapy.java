package repeater.zadanie2coma6;

import java.util.HashMap;

public class TworzenieMapy {

    Uczen uczen;
    Oceny oceny;
    double suma = 0.0;

    HashMap<Uczen, Oceny> mapaOcenUczniow = new HashMap<>();

    public void dodajOceny() {
        Uczen uczen = new Uczen("Tomasz", "Siudak", 1);
        Uczen uczen1 = new Uczen("Ewa", "Lalewcz", 2);
        Uczen uczen2 = new Uczen("Brajan", "Kowalski", 3);

        Oceny oceny = new Oceny(5.0, 5.0, 5.0, 5.0);
        Oceny oceny1 = new Oceny(5.0, 4.0, 4.0, 5.0);
        Oceny oceny2 = new Oceny(3.0, 2.0, 3.0, 5.0);

        mapaOcenUczniow.put(uczen, oceny);
        mapaOcenUczniow.put(uczen1, oceny1);
        mapaOcenUczniow.put(uczen2, oceny2);

        System.out.println("Rozmiar mapy: " + mapaOcenUczniow.size());
    }

    public void pokazSrednia() {
        for(HashMap.Entry<Uczen, Oceny> entry : mapaOcenUczniow.entrySet()) {
            System.out.println("Average grades of " + entry.getKey() + " equals " + entry.getValue().obliczSrednia());
        }
    }



}
