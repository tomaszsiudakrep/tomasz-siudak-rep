package repeater.ogolnie;

import java.util.LinkedList;

public class ListaLinked {

    LinkedList<Boook> listaLinked = new LinkedList<Boook>();
    Boook boook = new Boook("Tomasz", 2010);
    Boook boook1 = new Boook("Ewa", 1999);

    public void dodawanieKsiazek() {
        listaLinked.add(0, boook);
        listaLinked.add(1, boook1);
        System.out.println("Ilosc elementow: " + listaLinked.size());
    }

    public void pokazKsiazkiPrzed2000() {
        for (Boook ksiazki: listaLinked) {
            if(ksiazki.getYear() > 2000) {
                System.out.println(ksiazki);
            }
        }
    }




}
