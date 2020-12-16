package com.kodilla.testing.firstApp;

public class SalaryPayoutProcessor extends com.kodilla.testing.firstApp.SalaryPayout {

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    protected void payout() {

        System.out.println("Sending money to employee");
    }
}
