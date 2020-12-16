package com.kodilla.testing.payoutEmployee;

public class AccordSalary  implements Employee2 {

    private double salaryForOne = 5;
    private int amountOfProduct;

    public AccordSalary(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public double calculatorSalary() {
        return this.salaryForOne * this.amountOfProduct;

    }
}
