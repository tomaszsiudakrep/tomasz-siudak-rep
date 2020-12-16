package repeater.zadanie3coma4;

import java.util.ArrayList;
import java.util.Deque;

public class Rozdzielenie {

    ArrayList<String> parzysteLiczby = new ArrayList<>();
    ArrayList<String> nieparzysteLiczby = new ArrayList<>();
    int modulo;
    int dlugoscTextu;

    public void rozdzielenie(Deque<String> kolejka1) {
        for(int n = 0; n < 50; n++) {
            String object = kolejka1.poll();
            dlugoscTextu = object.length();
            modulo = dlugoscTextu % 2;

            if(modulo == 0) {
                parzysteLiczby.add(object);
            } else {
                nieparzysteLiczby.add(object);
            }
        }
        System.out.println("Parzyste " + parzysteLiczby.size());
        System.out.println("Nieparzyste " + nieparzysteLiczby.size());
    }
}
