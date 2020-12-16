package com.kodilla.testing.zadania2c6;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        Map<Student, Oceny> dziennik = new HashMap<>();
        double suma;
        int iloscPrzedmiotow = 4;

        Student student = new Student(1, "Tomek", "Siudak");
        Student student1 = new Student(2, "Ewa", "Lalewicz");
        Student student2 = new Student(3, "Jim", "Halpert");

        Oceny oceny = new Oceny(5.0, 5.0, 5.0, 5.0);
        Oceny oceny1 = new Oceny(4.0, 4.5, 4.0, 4.0);
        Oceny oceny2 = new Oceny(3.0, 3.0, 3.0, 3.0);

        dziennik.put(student, oceny);
        dziennik.put(student1, oceny1);
        dziennik.put(student2, oceny2);


        for (Map.Entry<Student, Oceny> students: dziennik.entrySet()) {
            System.out.println(students.getKey() + " equals " + students.getValue().average());
        }


    }
}
