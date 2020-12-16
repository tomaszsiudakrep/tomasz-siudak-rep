package repeater.ogolnie;

import java.util.HashMap;

public class CzasHashMap {

    HashMap<String, Boook> czasHash = new HashMap();
    private Boook obiekt2;

    public void tworzenieHashMaps() {
        for(int n = 0; n < 666666; n++) {
            obiekt2 = new Boook("XYZ" + n, 2020 + n);
            czasHash.put("Klucz:" + n, obiekt2);
        }
        System.out.println("Rozmiar mapy: " + czasHash.size());
    }

    public void timeToRemoveAndAdd() {
        long time0 = System.nanoTime();
        czasHash.put("Klucz:00", new Boook("XXX", 2021));
        long time1 = System.nanoTime();
        System.out.println("Czas dodania: " + (time1 - time0));
    }
}
