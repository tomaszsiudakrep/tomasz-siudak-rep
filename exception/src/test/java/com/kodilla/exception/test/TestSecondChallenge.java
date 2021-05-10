package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class TestSecondChallenge {

    @Test
    void testSecondChallenge() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When&then
        Assertions.assertAll(
                () -> Assertions.assertThrows(Throwable.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5)),
                () -> Assertions.assertThrows(Throwable.class, () -> secondChallenge.probablyIWillThrowException(0.99, 1.5)),
                () -> Assertions.assertThrows(Throwable.class, () -> secondChallenge.probablyIWillThrowException(1.5, 1.5)));


        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.75, 0));

    }
}
