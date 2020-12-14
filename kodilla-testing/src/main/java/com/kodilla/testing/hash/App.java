package com.kodilla.testing.hash;

import java.time.LocalDate;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        Employee employee = new Employee("Tomasz", "Siudak", 1993, 06, 06);
        //System.out.println(employee.hashCode());

        Employee employee1 = new Employee("Ewa","Lalewicz", 1994, 04, 25);
        //System.out.println(employee1.hashCode());

        Employee employee2 = new Employee("Jim", "Halpert", 2000, 03, 25);

        Employee employee3 = new Employee("Pam", "Beasly", 1999, 9, 20);

        //LocalDate date = LocalDate.of(2020, 9, 27);
        //System.out.println(date);

        HashSet<Employee> workersSet = new HashSet<>();

        workersSet.add(employee);
        workersSet.add(employee1);
        workersSet.add(employee2);


        System.out.println(workersSet.size());
        System.out.println(workersSet.contains(employee));
        System.out.println("Set contains employee3? " + workersSet.contains(employee3));

        for (Employee worker: workersSet){
            if(worker.getBirthDate().getYear() >= 2000) {
                System.out.println("Worker youngest " + worker);
            }
        }

        String text = "Worker data: " + employee;
        System.out.println(text);


    }
}
