package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String nameOfCountry;
    private final BigDecimal peopleInCountry;


    public Country(final String nameOfCountry, final BigDecimal peopleInCountry) {
        this.nameOfCountry = nameOfCountry;
        this.peopleInCountry = peopleInCountry;
    }

    public BigDecimal getPeopleQuantity() {
        return getPeopleInCountry();
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public BigDecimal getPeopleInCountry() {
        return peopleInCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (nameOfCountry != null ? !nameOfCountry.equals(country.nameOfCountry) : country.nameOfCountry != null)
            return false;
        return peopleInCountry != null ? peopleInCountry.equals(country.peopleInCountry) : country.peopleInCountry == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfCountry != null ? nameOfCountry.hashCode() : 0;
        result = 31 * result + (peopleInCountry != null ? peopleInCountry.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "nameOfCountry='" + nameOfCountry + '\'' +
                ", peopleInCountry=" + peopleInCountry +
                '}';
    }
}
