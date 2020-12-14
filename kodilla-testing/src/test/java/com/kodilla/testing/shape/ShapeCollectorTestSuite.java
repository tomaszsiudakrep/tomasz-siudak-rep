package com.kodilla.testing.shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

import java.util.ArrayList;
import java.util.List;


@DisplayName("Tests")
public class ShapeCollectorTestSuite {

    @DisplayName("TestAddFigure")
    @org.junit.jupiter.api.Nested
    public class TestAddFigure {

        @org.junit.jupiter.api.Test
        public void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new com.kodilla.testing.shape.Square(10.0);

            //when
            shapeCollector.addFigure(shape);

            //then
            Assertions.assertEquals(1, shapeCollector.shapeCollection.size());
        }
    }

    @DisplayName("TestRemoveFigure")
    @Nested
    public class TestRemoveFigure{


    @org.junit.jupiter.api.Test
    public void testRemoveExistFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(10.0);
        shapeCollector.addFigure(shape);

        //when
        boolean result = shapeCollector.removeFigure(shape);

        //then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapeCollector.shapeCollection.size());
    }


    @org.junit.jupiter.api.Test
    public void testRemoveNotExistFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square(10.0);

        //when
        boolean result = shapeCollector.removeFigure(shape);

        //then
        Assertions.assertFalse(result);
    }
    }

    @Nested
    @DisplayName("TestGetFigureNumber")
    public class TestGetFigureNumber {

        @org.junit.jupiter.api.Test
        public void testGetFigureExistNumber() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(10.0);
            shapeCollector.addFigure(shape);
            //when
            Shape shapeResult = shapeCollector.getFigure(0);

            //then
            Assertions.assertEquals(shapeCollector.shapeCollection.get(0), shapeResult);

        }

        @org.junit.jupiter.api.Test
        public void testGetFigureNotExistNumber() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(10.0);

            //when
            Shape result = shapeCollector.getFigure(0);

            //then
            Assertions.assertNull(result);
        }
    }

    @Nested
    @DisplayName("TestShowFigures")
    public class TestShowFigures{

@org.junit.jupiter.api.Test
public void testShowFigures() {
    //given
    ShapeCollector shapeCollector = new ShapeCollector();
    Shape shape = new Square(10.0);
    shapeCollector.addFigure(shape);
    List<Shape> shapeList = new ArrayList<>();
    shapeList.add(shape);

    //when
    List<Shape> shapeResult = shapeCollector.shapeCollection;

    //then
    Assertions.assertEquals(shapeList.toString(), shapeResult.toString());
}
}
}
