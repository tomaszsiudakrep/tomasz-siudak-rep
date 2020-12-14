package com.kodilla.testing.simpleprograms;

public class ShapeDrawer {
    private Shape shape;

    public ShapeDrawer(Shape shape) {
        this.shape = shape;
    }

    public void drawer() {
        System.out.println("Start drawing...");
        this.shape.draw();
        System.out.println("End of drawing");
    }
}
