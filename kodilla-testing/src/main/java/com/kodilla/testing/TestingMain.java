package com.kodilla.testing;

    import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Calculator calculator2 = new Calculator();

        int add2 = calculator.add(15, 10);
        int sub2 = calculator2.sub(10, 10);

        if(add2 == 25) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

        if(sub2 == 0) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error");
        }

    }
}
