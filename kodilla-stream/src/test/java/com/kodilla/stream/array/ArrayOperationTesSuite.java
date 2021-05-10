package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationTesSuite {

    @Test
    void testGetAverage() {
        //Given

        int value = 0;
        int[] num = new int[20];
        for(int n = 0; n < 20; n++){
            num[n] = value;
            value++;
        }

        //When
        double result = ArrayOperations.getAverage(num);
        //Then
        Assertions.assertEquals(9.5, result);

    }
}
