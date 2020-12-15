package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {

    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();

        theList.add("John SMith");
        theList.add("John Travolta");
        theList.add("Wesley Snipes");
        theList.add("klohe sks");
        theList.add("Tomasz Ssssss");
        theList.add("Walter White");
        theList.add("Jessy Pinkman");

        return new ArrayList<>(theList);
    }
}
