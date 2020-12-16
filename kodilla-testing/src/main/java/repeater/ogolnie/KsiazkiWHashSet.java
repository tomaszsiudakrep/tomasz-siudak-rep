package repeater.ogolnie;

import java.util.HashSet;

public class KsiazkiWHashSet {

    HashSet<Boook> setBoook = new HashSet<>();
    Boook boook = new Boook("Tomasz", 1993);
    Boook boook2 = new Boook("Ewcia", 2010);

    public void addBoooksToSet() {
        setBoook.add(boook);
        setBoook.add(boook2);

        System.out.println("Liczb elementów hash setu: " + setBoook.size());
    }

    public void showMeKsiazki() {
        for (Boook setBoook:setBoook) {
            if(setBoook.getYear() < 2010) {
                System.out.println(setBoook);
            }
        }
    }

}
