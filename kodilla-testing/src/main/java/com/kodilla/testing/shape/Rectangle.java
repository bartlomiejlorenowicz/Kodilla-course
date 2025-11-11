package com.kodilla.testing.shape;

public class Rectangle implements Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }

    @Override
    public double getField() {
       return a * b;
    }
}
