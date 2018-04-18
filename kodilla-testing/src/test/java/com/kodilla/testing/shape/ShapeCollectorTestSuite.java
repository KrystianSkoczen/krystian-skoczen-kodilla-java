package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        ShapeCollector.addFigure();

        //Then
        Assert.assertEquals(1, shapeCollector.getShapeQuantity());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        boolean result = shapeCollector.removeFigure();

        //Then
        Assert.assertFalse(result);    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        ShapeCollector retrievedFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(theFigure, retrievedFigure);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        ShapeCollector exposeFigure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(theFigure, exposeFigure);
    }


}