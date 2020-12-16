package repeater.ogolnie;

import java.util.LinkedList;

public class CzasLinkedList {

    LinkedList<Boook> listaCzasowa = new LinkedList<>();
    private Boook obiekt;

    public void tworzenieListyLinked() {
        for(int n = 0; n < 666666; n++) {
            obiekt = new Boook("Tytuł" + n, 1000 + n);
            listaCzasowa.add(obiekt);
        }
        System.out.println("Rozmiar listy linked list: " + listaCzasowa.size());

    }

    public void czasUsuwaniaObiektow() {
        long time0 = System.nanoTime();
        listaCzasowa.remove(0);
        long time1 = System.nanoTime();
        System.out.println("Czas: " + (time1 - time0));

        long time2 = System.nanoTime();
        listaCzasowa.remove(listaCzasowa.size() - 1);
        long time3 = System.nanoTime();
        System.out.println("Czas: " + (time3 - time2));
    }

    public void czasDodawaniaObiektow() {
        long time0 = System.nanoTime();
        listaCzasowa.add(0, new Boook("NowyTytul", 20000));
        long time1 = System.nanoTime();
        System.out.println("Czas: " + (time1 - time0));

        long time2 = System.nanoTime();
        listaCzasowa.add(listaCzasowa.size(), new Boook("XXX", 2000));
        long time3 = System.nanoTime();
        System.out.println("Czas: " + (time3 - time2));
    }
}
