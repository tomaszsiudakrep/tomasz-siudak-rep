package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Square implements Shape{

    private static String name = "Square";
    private double lengthA;

    public Square(double lengthA) {
        this.lengthA = lengthA;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return pow(lengthA, 2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.lengthA, lengthA) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(lengthA);
        return (int) (temp ^ (temp >>> 32));
    }
}
