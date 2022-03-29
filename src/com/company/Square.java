package com.company;
import resize.resizeable;
public class Square extends Shape implements resizeable{
    private double side = 2.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
       super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString()+" ,Area is: "+getArea();
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()*percent/100);
    }
}