package repeater.zadanie4coma4;

import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        Armata armata = new Armata(true, "cannon 1");
        Armata armata1 = new Armata(false, "cannon 2");
        Armata armata2 = new Armata(false, "cannon 3");

        LinkedList<Armata> listaArmat = new LinkedList<>();
        listaArmat.add(armata);
        listaArmat.add(armata1);
        listaArmat.add(armata2);
        System.out.println("Ilość armat: " + listaArmat.size());

        for (Armata check: listaArmat) {
            if(check.isLoaded()) {
                System.out.println("Armata: " + check.getNumberOfCannon() + " is loaded");
            } else {
                System.out.println("Armata: " + check.numberOfCannon + " is not loaded...please wait");
                check.loaded = true;
                    if(check.isLoaded()) {
                        System.out.println("Armata: " + check.getNumberOfCannon() + " is loaded");
                    }
            }
        }

    }

}
