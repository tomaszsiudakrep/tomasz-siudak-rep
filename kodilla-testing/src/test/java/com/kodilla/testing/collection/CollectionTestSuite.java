package com.kodilla.testing.collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tetsy")
public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator;

    @BeforeClass
    public static void beforeClass() {
        oddNumbersExterminator = new OddNumbersExterminator();

    }
    @Test
    public void testParzyste() {
        //Given
    List<Integer> normalList = new ArrayList<>();
    normalList.add(1);
    normalList.add(2);
    normalList.add(3);
    normalList.add(4);
    normalList.add(5);
    normalList.add(6);

    List<Integer> expectedList = new ArrayList<>();
    expectedList.add(2);
    expectedList.add(4);
    expectedList.add(6);

        //When
    List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(result, expectedList);
    }

    @Test
    public void empty() {
        //Given
    List<Integer> emptyList = new ArrayList<>();
        //When
    List<Integer> resultEmpty = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(resultEmpty, emptyList);
    }


}
