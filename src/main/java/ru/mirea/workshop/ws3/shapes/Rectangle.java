package ru.mirea.workshop.ws3.shapes;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.setWidth(width);
        this.setHeight(height);
    }

    public Rectangle(double width, double height) {
        this(width, height, "transparent", false);
    }

    public Rectangle() {
        this(0, 0);
    }

    @Override
    public double getArea() {
        return getWidth() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return String.format("Rectangle w=%.03f h=%.03f", getWidth(), getHeight());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
