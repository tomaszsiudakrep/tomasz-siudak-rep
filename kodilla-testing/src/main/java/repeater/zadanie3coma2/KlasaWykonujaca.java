package repeater.zadanie3coma2;

import java.util.ArrayDeque;

public class KlasaWykonujaca {

    ArrayDeque<Book> stosik = new ArrayDeque<>();
    Book zmienna;

    public void dodanieKsiazekDoStosu() {
        Book book0 = new Book("Tomasz", 2021);
        Book book1 = new Book("Ewcia", 2021);
        Book book2 = new Book("Co jest", 2010);

        stosik.push(book0);
        stosik.push(book1);
        stosik.push(book2);
        System.out.println("Rozmiar stosu " + stosik.size());


    }
    public void removeAll() {
       for(int n = 0; n <= stosik.size(); n++) {
             zmienna = stosik.pop();
             System.out.println("Ostatnio usunięta: " + zmienna);
            }
                System.out.println("Rozmiar stosu " + stosik.size());
           System.out.println("Ostatnio usunięta: " + zmienna);


    }

    }


