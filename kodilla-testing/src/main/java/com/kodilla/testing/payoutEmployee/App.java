package com.kodilla.testing.payoutEmployee;

public class App {

        public static void main(String[] args) {

               AccordSalary accordSalary = new AccordSalary(1000);
               salaryPlusBonus salaryPlusBonus = new salaryPlusBonus(true);
               FixedSalary fixedSalary = new FixedSalary(5000);
               HourlySalary hourlySalary = new HourlySalary(200, 50);

                SalaryProcessor salaryProcessor = new SalaryProcessor(accordSalary);
                salaryProcessor.processPayoutSalary();

        }
}
