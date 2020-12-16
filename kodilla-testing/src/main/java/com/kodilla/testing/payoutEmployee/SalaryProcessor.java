package com.kodilla.testing.payoutEmployee;

public class SalaryProcessor extends SalaryPay {

    public SalaryProcessor(Employee2 employee2) {
        super(employee2);
    }

    @Override
    protected void payoutProcess() {
        System.out.println("Connecting to the bank..Please wait..");
    }
}
