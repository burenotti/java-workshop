package ru.mirea.workshop.ws3.shapes;

public class Square extends Rectangle {
    public Square() {
        this(0);
    }

    public Square(double width) {
        this(width, "transparent", false);
    }

    public Square(double width, String color, boolean filled) {
        super(width, width, color, filled);
    }

    @Override
    public void setHeight(double height) {
        super.setWidth(height);
        super.setHeight(height);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
