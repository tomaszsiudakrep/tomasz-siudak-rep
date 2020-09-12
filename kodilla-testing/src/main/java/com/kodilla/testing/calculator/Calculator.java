package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add() {
        return this.a + this.b;
    }
    public int sub() {
        return this.a - this.b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
