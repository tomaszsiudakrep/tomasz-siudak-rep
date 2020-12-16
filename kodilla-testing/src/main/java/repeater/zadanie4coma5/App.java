package repeater.zadanie4coma5;

import java.time.LocalTime;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {



        Zegar zegar = new Zegar(22, 22, 22);
        Zegar zegar1 = new Zegar(07, 59, 59);
        Zegar zegar2 = new Zegar(10, 00, 00);


        LinkedList<Zegar> listaZegarow = new LinkedList<>();

            listaZegarow.add(zegar);
            listaZegarow.add(zegar1);
            listaZegarow.add(zegar2);
            System.out.println("Liczba zegarów: " + listaZegarow.size());


            for (Zegar plusOneMinute: listaZegarow) {
                LocalTime newTime = plusOneMinute.time.plusMinutes(1);
                System.out.println(newTime);
            }


    }

}
