package com.kodilla.testing.payoutEmployee;

import com.kodilla.testing.payoutEmployee.Employee2;

public abstract class SalaryPay {
    private Employee2 employee2;

    public SalaryPay(Employee2 employee2) {
        this.employee2 = employee2;
    }

    abstract protected void payoutProcess();

    public void processPayoutSalary() {
        System.out.println("Prepare a payout: " + this.employee2.calculatorSalary());
        this.payoutProcess();
        System.out.println("Done!");

    }



}
