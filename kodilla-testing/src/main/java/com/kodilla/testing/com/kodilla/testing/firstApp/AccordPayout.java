package com.kodilla.testing.firstApp;

public class AccordPayout implements Employee{
    private int payoutForOne = 5;
    private int amountOfProduct;

    public AccordPayout(int amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public double calculateSalary () {
        return this.amountOfProduct * payoutForOne;
    }
}
