package repeater.ogolnie;

import java.util.Scanner;

public class Tablicaliczb {

    private int [] tablica = new int[20];
    private double srednia = 0.0;
    private int wartoscPoczatkowa;

    Scanner scanner = new Scanner(System.in);

    public void dodawanieElementowDoTab() {
        System.out.println("Podaj wartość początkową pierwszego elementu tablicy typu int: ");
        wartoscPoczatkowa = scanner.nextInt();

        for(int n = 0; n < 20; n++) {
            tablica[n] = wartoscPoczatkowa;
            System.out.println("Element " + tablica[n] + " tablicy = " + wartoscPoczatkowa);
            srednia += wartoscPoczatkowa;
            wartoscPoczatkowa++;
        }
        System.out.println("Ilość elementów w tablicy = " + tablica.length);
        System.out.println("Srednia = " + srednia / tablica.length);
    }


}
