package ru.mirea.workshop.ws3.movable;

import org.junit.Assert;
import org.junit.Test;

public class MovableCircleTest {
    @Test
    public void test_MovableCircle() {

        var p = new MovableCircle(1, 2, 10, 20);
        Assert.assertEquals(1, p.getX());
        Assert.assertEquals(2, p.getY());
        Assert.assertEquals(10, p.getXSpeed());
        Assert.assertEquals(20, p.getYSpeed());

    }

    @Test
    public void test_moveUp() {
        var p = new MovableCircle(10, 40, 10, 20);
        p.moveUp();
        Assert.assertEquals(10, p.getX());
        Assert.assertEquals(20, p.getY());
        p.moveUp();
        Assert.assertEquals(10, p.getX());
        Assert.assertEquals(0, p.getY());
    }

    @Test
    public void test_moveLeft() {
        var p = new MovableCircle(40, 40, 10, 20);
        p.moveLeft();
        Assert.assertEquals(30, p.getX());
        Assert.assertEquals(40, p.getY());
        p.moveLeft();
        Assert.assertEquals(20, p.getX());
        Assert.assertEquals(40, p.getY());
    }

    @Test
    public void test_moveRight() {
        var p = new MovableCircle(40, 40, 10, 20);
        p.moveRight();
        Assert.assertEquals(50, p.getX());
        Assert.assertEquals(40, p.getY());
        p.moveRight();
        Assert.assertEquals(60, p.getX());
        Assert.assertEquals(40, p.getY());
    }

    @Test
    public void test_moveDown() {
        var p = new MovableCircle(40, 40, 10, 20);
        p.moveDown();
        Assert.assertEquals(40, p.getX());
        Assert.assertEquals(60, p.getY());
        p.moveDown();
        Assert.assertEquals(40, p.getX());
        Assert.assertEquals(80, p.getY());
    }

    @Test
    public void test_toString() {
        var p = new MovableCircle(40, 50, 10, 20);
        Assert.assertEquals("Point x=40 y=50", p.toString());
    }
}

