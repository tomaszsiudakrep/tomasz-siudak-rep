package com.kodilla.testing.mapaUczniow;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Student student = new Student("Tomasz", "1");
        Student student1 = new Student("Ewa", "2");
        Student student2 = new Student("Tom", "3");

        Grades grades = new Grades(5.0, 5.0, 5.0);
        Grades grades1 = new Grades(4.0, 4.5, 4.5);
        Grades grades2 = new Grades(4.0, 4.0, 4.0);

        HashMap<Student, Grades> dziennik = new HashMap<>();

        dziennik.put(student, grades);
        dziennik.put(student1, grades1);
        dziennik.put(student2, grades2);



        System.out.println(dziennik.get(student));

        grades.average();
        grades1.average();
        grades2.average();

        for(Map.Entry<Student, Grades> entry: dziennik.entrySet()){
            grades.average();
        }

    }
}
