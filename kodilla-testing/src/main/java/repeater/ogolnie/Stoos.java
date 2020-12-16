package repeater.ogolnie;

import java.util.ArrayDeque;

public class Stoos {

    ArrayDeque<Boook> stooss = new ArrayDeque<>();
    Boook boook;

    Boook boook1 = new Boook("Tomcik", 1993);
    Boook boook2 = new Boook("Ewcik", 2010);

    public void stworzStos() {
        stooss.push(boook1);
        stooss.push(boook2);
        System.out.println("Rozmiar stosu: " + stooss.size());
    }

    public void removeStoos() {
        //stooss.removeAll(stooss);
        boook = stooss.pop();
        boook = stooss.pop();
        System.out.println("Rozmiar stosu: " + stooss.size());
        System.out.println("Ostatnio usunięta książka: " + boook);
    }
}
