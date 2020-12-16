package com.kodilla.testing.payoutEmployee;

public class FixedSalary implements Employee2{
    private double fixedSalaryPay;

    public FixedSalary(double fixedSalaryPay) {
        this.fixedSalaryPay = fixedSalaryPay;
    }

    public double calculatorSalary() {
        return this.fixedSalaryPay;
    }
}
