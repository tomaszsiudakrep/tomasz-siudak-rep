package com.kodilla.testing.lettersSnake;

import java.util.ArrayDeque;
import java.util.Random;

public class Letters {

    public void joinToList(){


        String newValue = "";
        int randomNumber;

        ArrayDeque<String> lettersSnake = new ArrayDeque<>();
        Random random = new Random();

        for(int n = 0; n < 50; n++) {
            randomNumber = random.nextInt(50);
            String value = "a";

            for(int i = 0; i < randomNumber; i++){
                 newValue += value;
            }
            lettersSnake.offer(newValue);

            System.out.println();

        }
        System.out.println(lettersSnake.size());
        System.out.println(lettersSnake.getFirst());

    }
}
