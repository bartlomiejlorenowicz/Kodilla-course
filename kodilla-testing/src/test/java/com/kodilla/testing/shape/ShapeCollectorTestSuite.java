package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Test Shape name and field")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Add and remove shapes")
    class AddAndRemoveShapesTests {

        @DisplayName("Should add a figure to the collection")
        @Test
        public void testsAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle = new Circle(5.0);

            //When
            shapeCollector.addFigure(circle);

            //Then
            Assertions.assertEquals(shapeCollector.getShapes().size(), 1);
        }

        @DisplayName("should remove a figure from the collection")
        @Test
        public void testsRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(3.0);
            Shape rectangle = new Rectangle(2,2);

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(rectangle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            Assertions.assertEquals(1, shapeCollector.getShapes().size());
        }

    }

    @Nested
    @DisplayName("Get")
    class GetShapesTests {

        @DisplayName("should retrieved figure")
        @Test
        public void testsGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(4.0);
            shapeCollector.addFigure(circle);

            //When
            Shape result = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(circle, result);
        }
    }

    @Nested
    @DisplayName("Display")
    class DisplayShapesTests {

        @DisplayName("should show figure")
        @Test
        public void testsShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5.0);
            shapeCollector.addFigure(circle);

            //When
            String result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals("Circle", result);
        }
    }

}
