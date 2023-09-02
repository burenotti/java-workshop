package ru.mirea.workshop.ws3.movable;

public class MovableCircle implements Movable {
    private final MovablePoint point;
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.point = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        point.moveUp();
    }

    @Override
    public void moveDown() {
        point.moveDown();
    }

    @Override
    public void moveLeft() {
        point.moveLeft();
    }

    @Override
    public void moveRight() {
        point.moveRight();
    }

    @Override
    public String toString() {
        return String.format("Circle R=%d C=(%d, %d)", radius, point.getX(), point.getY());
    }
}
