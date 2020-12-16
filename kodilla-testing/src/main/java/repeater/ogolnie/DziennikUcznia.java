package repeater.ogolnie;

import java.util.HashMap;
import java.util.Map;

public class DziennikUcznia {

    HashMap<DaneUczniow, OcenyUczniow> dzienik = new HashMap<>();
    OcenyUczniow ocenyUczniow;

    DaneUczniow daneUczniow2 = new DaneUczniow("Tomasz", 1);
    DaneUczniow daneUczniow1 = new DaneUczniow("Ewa", 2);

    OcenyUczniow ocenyUczniow2 = new OcenyUczniow(5.0, 5.0, 5.0);
    OcenyUczniow ocenyUczniow1 = new OcenyUczniow(5.0, 4.5, 5.0);

    public void tworzenieDziennika() {
        dzienik.put(daneUczniow2, ocenyUczniow2);
        dzienik.put(daneUczniow1, ocenyUczniow1);
        System.out.println("Ilość uczniów w dzienniku: " + dzienik.size());
    }

    public void pokazSrednia() {
        for (Map.Entry<DaneUczniow, OcenyUczniow> entry: dzienik.entrySet()) {
            System.out.println(entry.getValue().sredniaOcenUczniow());
        }
    }

}
