package com.kodilla.good.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(final String taskType) {
        return switch (taskType) {
            case SHOPPING -> new ShoppingTask("Buy groceries", "Bread", 2.0);
            case PAINTING -> new PaintingTask("Paint fence", "White", "Fence");
            case DRIVING -> new DrivingTask("Drive to work", "Rzeszow", "Car");
            default -> null;
        };
    }
}
