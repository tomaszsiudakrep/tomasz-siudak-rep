package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private static String name = "Triangle";
    private double length;
    private double height;

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        return (length * height) / 2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.length, length) != 0) return false;
        return Double.compare(triangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(length);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
