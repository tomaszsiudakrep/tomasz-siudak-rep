package repeater.zadanie4coma2;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        HashSet<ZamowieniaInternet> zamowienia = new HashSet<>();

        ZamowieniaInternet zamowienie1 = new ZamowieniaInternet(1, "Kule");
        ZamowieniaInternet zamowienie2 = new ZamowieniaInternet(2, "Walki");
        ZamowieniaInternet zamowienie3 = new ZamowieniaInternet(2, "Walki");


        zamowienia.add(zamowienie1);
        zamowienia.add(zamowienie2);
        zamowienia.add(zamowienie2);
        zamowienia.add(zamowienie3);

        System.out.println(zamowienia.size());
    }

}
