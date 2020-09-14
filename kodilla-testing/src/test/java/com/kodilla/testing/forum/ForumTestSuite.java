package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.;

@DisplayName("Forum test Suite")
class ForumTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test case : end");
    }
    @BeforeAll
    public void beforeAll() {
        System.out.println("Test suite: begin");
    }
    @AfterAll
    public void afterAll {
        System.out.println("Test suite: end");
    }
    @DisplayName(
            "When created SimpleUser with name, " + "then etUsername should return correct name"
    )

    @Test
    void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        // When
        String result = simpleUser.getUsername();
        String expectedResult = "theForumUser";

        // Then
        Assertions.assertEquals(expectedResult, result);
    }
}
