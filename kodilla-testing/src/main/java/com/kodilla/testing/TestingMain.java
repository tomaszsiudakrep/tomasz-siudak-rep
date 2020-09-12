package com.kodilla.testing;

    import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(15, 10);
        int add = calculator.add();
        int sub = calculator.sub();

        if(add == 25) {
            System.out.println("test ok");
        } else {
            System.out.println("Error!");
        }

        if(sub == 5) {
            System.out.println("Test ok");
        }   else {
            System.out.println("Error!");
        }
    }
}
