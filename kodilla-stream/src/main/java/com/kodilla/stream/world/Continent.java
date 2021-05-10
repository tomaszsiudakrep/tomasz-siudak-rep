package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {

    private final String continent;
    private Set<Country> listOfCountry = new HashSet<>();

    public Continent(final String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country){
        listOfCountry.add(country);
    }

    public String getContinent() {
        return continent;
    }

    public Set<Country> getListOfCountry() {
        return new HashSet<>(listOfCountry);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent1 = (Continent) o;

        return continent.equals(continent1.continent);
    }

    @Override
    public int hashCode() {
        return continent != null ? continent.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continent + '\'' +
                ", listOfCountry=" + listOfCountry +
                '}';
    }
}
