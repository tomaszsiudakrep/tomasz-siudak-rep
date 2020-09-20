package com.kodilla.testing.collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CollectionTestSuite {

    private static OddNumbersExterminator oddNumbersExterminator;

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass(){
        oddNumbersExterminator = new OddNumbersExterminator();
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(12);

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(6);
        expectedResultList.add(12);
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        assertEquals(expectedResultList, resultList);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given

        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        assertEquals(emptyList, resultList);
    }

}
