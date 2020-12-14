package com.kodilla.testing.hashMapExercises;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main (String[] args) {

        Employee employee = new Employee("Tomasz", "93060608978");
        Employee employee1 = new Employee("Ewa", "94042577624");

        Salary salary = new Salary(3100.00, 400.00);
        Salary salary1 = new Salary(2800.00, 350.00);

        System.out.println("Equal ? :" + (employee.equals(employee1)));

        HashMap<Employee, Salary> salaryPayout = new HashMap<>();

        salaryPayout.put(employee, salary);
        salaryPayout.put(employee1, salary1);

        System.out.println("Size of map: " + salaryPayout.size());

        for(Map.Entry<Employee, Salary> entry: salaryPayout.entrySet()) {
            System.out.println(entry.getKey() + " = " +  entry.getValue());
        }

    }
}
