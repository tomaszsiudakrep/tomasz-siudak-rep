package com.kodilla.testing.zadanie2coma5;

import java.util.ArrayList;
import java.util.Collections;

public class Grades2coma5 {

    ArrayList<Double> gradesIT = new ArrayList<>();

    public void putGradesShowAndRemove() {


        gradesIT.add(5.0);
        gradesIT.add(5.0);
        gradesIT.add(5.0);
        gradesIT.add(3.0);
        gradesIT.add(6.0);

        System.out.println(Collections.max(gradesIT));
        System.out.println(Collections.min(gradesIT));

        gradesIT.remove(Collections.max(gradesIT));
        gradesIT.remove(Collections.min(gradesIT));
    }
    private double summary = 0.0;

    public void averageCheck() {
        for (Double grade: gradesIT) {
            summary = summary + grade;
        }

        System.out.println(summary / gradesIT.size());
    }





}
