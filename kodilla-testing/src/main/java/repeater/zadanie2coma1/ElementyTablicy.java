package repeater.zadanie2coma1;

public class ElementyTablicy {

    int [] tablicaLiczb = new int[20];
    int suma = 0;
    int poczatkowaWartosc = 0;
    double srednia;

    public void wstawianieLiczbDoTablicy() {
        for(int n = 0; n < tablicaLiczb.length; n++) {
            tablicaLiczb[n] = poczatkowaWartosc;
            System.out.println("Element tablicy numer " + tablicaLiczb[n] + " = " + poczatkowaWartosc);
            suma += poczatkowaWartosc;
            poczatkowaWartosc++;
        }
    }

    public void obliczenieSredniej() {
        srednia = suma / tablicaLiczb.length;
        System.out.println("Srednia liczb z tablicy o długości " + tablicaLiczb.length + " = " + srednia);
    }




}
