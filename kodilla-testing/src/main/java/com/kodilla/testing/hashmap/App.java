package com.kodilla.testing.hashmap;

public class App {
    public static void main(String[] args) {

        Employee employee = new Employee("Tomasz", "Siudak", "93060608978");
        Employee employee1 = new Employee("Tomasz", "Siudak", "93060608");

        System.out.println("employee == employee1 : " + (employee.equals(employee1)));
    }
}
