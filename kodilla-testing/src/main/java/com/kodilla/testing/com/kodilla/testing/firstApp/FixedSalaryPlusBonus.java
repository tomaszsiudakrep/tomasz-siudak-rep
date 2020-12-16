package com.kodilla.testing.firstApp;

public class FixedSalaryPlusBonus implements Employee {

    private double fixedSalary = 2000;
    private boolean bonus;

    public FixedSalaryPlusBonus(boolean bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        if(bonus) {
            return fixedSalary + (fixedSalary * 0.2);
        }  else {
            return fixedSalary;
        }
    }
}
