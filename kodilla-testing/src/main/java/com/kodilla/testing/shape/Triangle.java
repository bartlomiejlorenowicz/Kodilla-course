package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;

    public Triangle(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return  (Math.pow(a, 2) * Math.sqrt(3)) / 4;
    }
}
