package org.example;

class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length)  {
        this.length = length;
    }

    public double getLength()  {
        return this.length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2* (length + width);
    }
}
