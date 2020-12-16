package repeater.ogolnie;

import java.util.Random;

public class WyscigSum {

    private int sumaA = 1000;
    private int sumaB = 0;
    private int liczbaIteracji = 0;
    private int randomA;
    private int randomB;

    Random random = new Random();

    public void wyscig() {
        while (sumaA > sumaB) {
            for(int n = 0; sumaA > sumaB; n++) {
                liczbaIteracji++;
                System.out.println("Iteracja numer: " + liczbaIteracji);

                randomA = random.nextInt(9);
                sumaA += randomA;
                System.out.println("Suma A = " + sumaA);

                randomB = random.nextInt(49);
                sumaB += randomB;
                System.out.println("Suma B = " + sumaB);
            }
        }
        System.out.println(sumaA < sumaB);
    }
}
