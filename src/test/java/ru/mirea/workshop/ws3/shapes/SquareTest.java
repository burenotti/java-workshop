package ru.mirea.workshop.ws3.shapes;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void test_Square() {
        {
            var c = new Square();
            Assert.assertEquals("transparent", c.getColor());
            Assert.assertFalse(c.isFilled());
        }
        {
            var c = new Square(3);
            Assert.assertEquals("transparent", c.getColor());
            Assert.assertEquals(3, c.getWidth(), 1e-7);
            Assert.assertEquals(3, c.getHeight(), 1e-7);
            Assert.assertFalse(c.isFilled());
        }
        {
            var c = new Square(5, "white", true);
            Assert.assertEquals("white", c.getColor());
            Assert.assertEquals(5, c.getWidth(), 1e-7);
            Assert.assertEquals(5, c.getHeight(), 1e-7);
            Assert.assertTrue(c.isFilled());
        }
    }

    @Test
    public void test_getArea() {
        {
            var square = new Square(3);
            Assert.assertEquals(9, square.getArea(), 1e-5);
        }
        {
            var square = new Square(4);
            Assert.assertEquals(16, square.getArea(), 1e-5);
        }
    }

    @Test
    public void test_getPerimeter() {
        {
            var c = new Square(3);
            Assert.assertEquals(12, c.getPerimeter(), 1e-5);
        }
        {
            var c = new Square(4);
            Assert.assertEquals(16, c.getPerimeter(), 1e-5);
        }
    }

    @Test
    public void test_setWidth() {
        var s = new Square(3);
        s.setWidth(4);
        Assert.assertEquals(4, s.getWidth(), 1e-7);
        Assert.assertEquals(4, s.getHeight(), 1e-7);
    }

    @Test
    public void test_setHeight() {
        var s = new Square(3);
        s.setHeight(4);
        Assert.assertEquals(4, s.getWidth(), 1e-7);
        Assert.assertEquals(4, s.getHeight(), 1e-7);
    }

    @Test
    public void test_Square_is_Shape() {
        var square = new Square(3, "black", true);
        Shape shape = square;
        Assert.assertEquals(square.getArea(), shape.getArea(), 1e-5);
        Assert.assertEquals(square.getPerimeter(), shape.getPerimeter(), 1e-5);
        Square Square2 = (Square) shape;
    }

    @Test
    public void test_Square_is_Rectangle() {
        var square = new Square(3, "black", true);
        // Проверка на upcast
        Rectangle rect = square;

        // Проверка работы перегруженных методов
        Assert.assertEquals(square.getArea(), rect.getArea(), 1e-5);
        Assert.assertEquals(square.getPerimeter(), rect.getPerimeter(), 1e-5);

        // Проверка на возможность сделать downcast
        Square square2 = (Square) rect;
    }
}
