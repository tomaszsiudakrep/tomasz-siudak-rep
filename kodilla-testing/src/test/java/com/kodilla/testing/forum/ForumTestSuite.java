package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;


@DisplayName("Forum test Suite")
public class ForumTestSuite {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Start testing..");
    }
    @Before
    public void before() {
        System.out.println("Start new test...");
    }



    @After
    public void after() {
        System.out.println("Test case is done..");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("Tests is finished");
    }

    @Test
    public void testCasRealname() {
        //Given
        SimpleUser simpleUser = new SimpleUser("Tom", "Tomasz Siudak");
        String resultReal = "Tomasz Siudak";

        //When
        String expectedReal = simpleUser.getRealName();

        //Then
        Assertions.assertEquals(expectedReal, resultReal);
    }

    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("Ewc", "Ewa Lalewicz");

        //When
        String result = simpleUser.getUsername();
        String expectedResult = "Ewc";

        //Then
        Assertions.assertEquals(expectedResult, result);
    }



}
