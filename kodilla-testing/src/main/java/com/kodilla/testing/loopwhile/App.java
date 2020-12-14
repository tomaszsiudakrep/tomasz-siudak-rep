package com.kodilla.testing.loopwhile;

import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args){

        Employee employee = new Employee("Toomasz", "Siudak", 1993, 6, 6);
        Employee employee1 = new Employee("Ewa", "Lalewicz", 1994, 4, 25);
        Employee employee2 = new Employee("Pig", "Pigi", 2018, 4, 20);

        HashSet<Employee> workersSet = new HashSet<>();

        workersSet.add(employee);
        workersSet.add(employee1);
        workersSet.add(employee2);

        Iterator<Employee> iteratorWorkersSet = workersSet.iterator();
        while(iteratorWorkersSet.hasNext()) {
            Employee currentWorker = iteratorWorkersSet.next();
            System.out.println(currentWorker);
        }

    }
}
