package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldtestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
            World world = new World();

            Country polska = new Country("Polska", new BigDecimal("500"));
            Country niemcy = new Country("Niemcy", new BigDecimal("600"));
            Country francja = new Country("Francja", new BigDecimal("300"));
            Country usa = new Country("USA", new BigDecimal("5000"));
            Country japonia = new Country("Japonia", new BigDecimal("3600"));

            Continent europe = new Continent("Europe");
            Continent asia = new Continent("Azja");
            Continent amerykaPl = new Continent("Ameryka Polnocna");

            world.addContinent(europe);
            world.addContinent(asia);
            world.addContinent(amerykaPl);

            europe.addCountry(polska);
            europe.addCountry(niemcy);
            europe.addCountry(francja);
            asia.addCountry(japonia);
            amerykaPl.addCountry(usa);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("10000");


        //Then

        Assertions.assertEquals(expectedResult, result);

    }
}
