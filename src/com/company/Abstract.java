package com.company;

public class Abstract {
    public static void main(String[] args){
        ShapeAbstract circle = new Circle2();
        ShapeAbstract square = new Square2();
        ShapeAbstract triangle = new Triangle2();

        circle.draw();
        square.draw();
        triangle.draw();
    }
}
