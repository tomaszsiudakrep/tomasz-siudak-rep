package repeater.ogolnie;

import java.util.ArrayDeque;
import java.util.Random;

public class ObiektyStringA {

    ArrayDeque<String> stringA = new ArrayDeque<>();
    Random random = new Random();
    private String letterA = "a";
    private String napis = "";
    private int wylosowanaLiczba;

    public void tworzenieWyrazu() {
        for(int n = 0; n < 50; n++) {
            wylosowanaLiczba = random.nextInt(50);

            for(int i = 0; i < wylosowanaLiczba; i++) {
                napis += letterA;
            }
            stringA.offer(napis);

        }
        System.out.println("Rozmiar kolejki: " + stringA.size());
        System.out.println(stringA.getLast());
    }

}
