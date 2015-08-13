package org.dimigo.inheritence;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int _width, int _height) {
        super(0, 0);
        width = _width;
        height = _height;
    }

    public Rectangle(int _centerX, int _centerY, int _width, int _height) {
        super(_centerX, _centerY);
        width = _width;
        height = _height;
    }

    @Override
    protected double calcArea() {
        return width*height;
    }
}