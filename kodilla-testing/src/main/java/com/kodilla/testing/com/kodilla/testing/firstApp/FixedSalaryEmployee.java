package com.kodilla.testing.firstApp;

public class FixedSalaryEmployee implements Employee {
    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

}
