package repeater.zadanie3coma5;

import java.util.HashMap;
import java.util.LinkedList;

public class ObslugaKsiazek {

    //Ksiazka ksiazka;

    LinkedList<Ksiazka> library = new LinkedList<>();
    HashMap<String, Ksiazka> maps = new HashMap<>();


    public void wstawKsiazki() {
        for(int n = 0; n < 500000; n++) {
            library.add(new Ksiazka("Ksiazka" + n, "Title" + n));
        }
        System.out.println("Size of list: " + library.size());
    }

    public void czasyUsuwaniaElementow() {
        //Na początku
            long time1 = System.nanoTime();
            library.remove(0);
            long time2 = System.nanoTime();
            System.out.println("Czas usuwania na poczatku: " + (time2 - time1));

        //Na koncu
            long time3 = System.nanoTime();
            library.remove(library.size()-1);
            long time4 = System.nanoTime();
            System.out.println("Czas usuwania na koncu: " + (time4 - time3));
    }

    public void czasWstawianiaElementow() {
        //na poczatku
            long tim1 = System.nanoTime();
            library.add(0, new Ksiazka("Ksiazka" , "Title"));
            long tim2 = System.nanoTime();
            System.out.println((tim2 - tim1));

        //na koncu
            long tim3 = System.nanoTime();
            library.add(new Ksiazka("Ksiazka", "Title"));
            long tim4 = System.nanoTime();
            System.out.println((tim4 - tim3));
    }

    public void uzupelnienieMapy() {

    }


}
