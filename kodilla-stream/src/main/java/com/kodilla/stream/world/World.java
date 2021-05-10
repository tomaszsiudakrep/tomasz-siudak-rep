package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    private Continent continent;
    private final Set<Continent> listOfContinent = new HashSet<>();

    public void addContinent(Continent continent){
        listOfContinent.add(continent);
    }

    public Set<Continent> getListOfContinent() {
        return new HashSet<>(listOfContinent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal totalPeople = listOfContinent.stream()
                .flatMap(continent1 -> continent1.getListOfCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        return totalPeople;
    }
}
