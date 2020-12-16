package repeater.zadanie3coma4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;

public class KolejkaStosu {

    Deque<String> kolejka1 = new ArrayDeque<>();
    Random random = new Random();

    String a = "a";
    String text = "";

    public void newTekst() {

        for(int h = 0; h < 50; h++) {
            int zmienna = random.nextInt(50);
                for(int n = 0; n < zmienna; n++) {
                    text += a;
                }
            kolejka1.offer(text);


        }
        System.out.print(kolejka1);
        System.out.println(kolejka1.size());

}


}
