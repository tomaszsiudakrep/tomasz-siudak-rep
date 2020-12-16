package com.kodilla.testing.module22;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tom", "Siudak", "930606");
        Employee employee2 = new Employee("Ewa", "Lalewicz", "940425");
        Employee employee3 = new Employee("Tomasz", "Siudak", "930606");

       SalaryParam param1 = new SalaryParam(5500.0, 500.0, 250.0);
       SalaryParam param2 = new SalaryParam(10000.0, 2020.0, 660.0);
       SalaryParam param3 = new SalaryParam(3500.0, 7000.0, 333.0);

       Map<Employee, SalaryParam> mapa = new HashMap<>();

       mapa.put(employee1, param1);
       mapa.put(employee2, param2);
       mapa.put(employee3, param3);

       //System.out.println("Salary of Tomasz Siudak = " + mapa.get(employee2));

        for (Map.Entry<Employee, SalaryParam> showMap: mapa.entrySet()) {
            if(showMap.getValue().baseSalary > 5000){
            System.out.println("Object: " + showMap.getKey() + " , " + showMap.getValue());
            }
        }


       


    }
}
