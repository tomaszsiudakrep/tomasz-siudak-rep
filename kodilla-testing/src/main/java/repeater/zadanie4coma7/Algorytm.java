package repeater.zadanie4coma7;

public class Algorytm {

    private int a = 11;
    private int b = 5;
    private double reszta;



    public void algorytmEuklidesa() {
        System.out.println("Algorytm Euklidesa..start");


        while(a != b) {
           if(a > b) {
               a -= b;
           } else {
             b -= a;
           }
        }

        System.out.println("Największy wspólny dzielnik to: " + a);

    }
}
