package ru.mirea.workshop.ws3.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle() {
        this(0, "transparent", false);
    }

    public Circle(double radius) {
        this(radius, "transparent", false);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.setRadius(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Ball R=%.03f", this.getRadius());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
