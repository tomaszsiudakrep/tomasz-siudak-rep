package com.kodilla.testing.payoutEmployee;

public class salaryPlusBonus implements Employee2{

    private double fixSalary = 2000;
    private boolean bonus;

    public salaryPlusBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public double calculatorSalary() {
        if(bonus) {
            return this.fixSalary + this.fixSalary * 0.2;
        } else {
            return this.fixSalary;
        }
    }
}
