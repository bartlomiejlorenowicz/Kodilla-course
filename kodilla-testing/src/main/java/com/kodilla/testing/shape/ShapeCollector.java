package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapes.size()) {
            return shapes.get(n);
        }
        return null;
    }

    public String showFigures() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < shapes.size(); i++) {
            result.append(shapes.get(i).getShapeName());
            if (i < shapes.size() - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
