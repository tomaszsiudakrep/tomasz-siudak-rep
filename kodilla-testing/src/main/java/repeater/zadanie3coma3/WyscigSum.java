package repeater.zadanie3coma3;

import java.util.Random;

public class WyscigSum {

    int sumaAA = 1000;
    int sumaBB = 0;
    int wylosowanaLiczba = 0;
    int numerPetli;
    Random random = new Random();


    public void petla(){

        while(sumaAA > sumaBB) {

                numerPetli++;
                System.out.println("Pętla numer: " + numerPetli);

                wylosowanaLiczba = random.nextInt(9);
                sumaAA+= wylosowanaLiczba;

                wylosowanaLiczba = random.nextInt(49);
                sumaBB+= wylosowanaLiczba;


            System.out.println("SumaB = " + sumaBB + "\n SumaA =" + sumaAA);
        }
    }


}
