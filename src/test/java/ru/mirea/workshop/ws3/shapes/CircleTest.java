package ru.mirea.workshop.ws3.shapes;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void test_Circle() {
        {
            var c = new Circle();
            Assert.assertEquals("transparent", c.getColor());
            Assert.assertFalse(c.isFilled());
        }
        {
            var c = new Circle(3);
            Assert.assertEquals("transparent", c.getColor());
            Assert.assertEquals(3, c.getRadius(), 1e-7);
            Assert.assertFalse(c.isFilled());
        }
        {
            var c = new Circle(5, "white", true);
            Assert.assertEquals("white", c.getColor());
            Assert.assertEquals(5, c.getRadius(), 1e-7);
            Assert.assertTrue(c.isFilled());
        }
    }

    @Test
    public void test_getArea() {
        {
            var circle = new Circle(3);
            Assert.assertEquals(9 * Math.PI, circle.getArea(), 1e-5);
        }
        {
            var circle = new Circle(4);
            Assert.assertEquals(16 * Math.PI, circle.getArea(), 1e-5);
        }
    }

    @Test
    public void test_getPerimeter() {
        {
            var c = new Circle(3);
            Assert.assertEquals(6 * Math.PI, c.getPerimeter(), 1e-5);
        }
        {
            var c = new Circle(4);
            Assert.assertEquals(8 * Math.PI, c.getPerimeter(), 1e-5);
        }
    }

    @Test
    public void test_Circle_is_Shape() {
        var circle = new Circle(3, "black", true);
        Shape shape = circle;
        Assert.assertEquals(circle.getArea(), shape.getArea(), 1e-5);
        Assert.assertEquals(circle.getPerimeter(), shape.getPerimeter(), 1e-5);
        Circle circle2 = (Circle) shape;
    }
}
