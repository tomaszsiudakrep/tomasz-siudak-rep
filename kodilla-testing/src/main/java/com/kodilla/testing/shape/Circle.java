package com.kodilla.testing.shape;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle implements Shape{

    private static String name = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return PI * pow(radius, 2);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
