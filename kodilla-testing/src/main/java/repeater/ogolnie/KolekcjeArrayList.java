package repeater.ogolnie;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class KolekcjeArrayList {

    ArrayList<String> parzystaIlosc = new ArrayList<>();
    ArrayList<String> nieparzystaIlosc = new ArrayList<>();
    private int dlugoscStringa;
    private String obiekt;


    public void rozdzielaczStringow(ArrayDeque<String> obiekcikDoPodzialu) {

        for(int n = 0; n < 50; n++){
            obiekt = obiekcikDoPodzialu.poll();
            dlugoscStringa = obiekt.length();

            if(dlugoscStringa % 2 == 0) {
                parzystaIlosc.add(obiekt);
            } else {
                nieparzystaIlosc.add(obiekt);
            }

        }
        System.out.println("Ilosc parzystych: " + parzystaIlosc.size());
        System.out.println("Ilosc nieparzystych: " + nieparzystaIlosc.size());
    }
}
