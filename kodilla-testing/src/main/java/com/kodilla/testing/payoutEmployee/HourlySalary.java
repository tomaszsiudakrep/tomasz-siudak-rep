package com.kodilla.testing.payoutEmployee;

public class HourlySalary implements Employee2{

    private double hours;
    private double hourlySalaryPay;

    public HourlySalary(double hours, double hourlySalaryPay) {
        this.hours = hours;
        this.hourlySalaryPay = hourlySalaryPay;
    }

    @Override
    public double calculatorSalary() {
        return this.hourlySalaryPay * this.hours;
    }
}
