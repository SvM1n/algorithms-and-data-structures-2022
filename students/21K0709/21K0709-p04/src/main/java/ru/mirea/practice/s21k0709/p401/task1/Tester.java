package ru.mirea.practice.s21k0709.p401.task1;

public abstract class Tester {

    public static void main(String[] args) {
        Shape shapeCircle = new Circle(4, "yellow");
        System.out.println("Area circle: " + shapeCircle.getArea());
        System.out.println("Perimeter circle: " + shapeCircle.getPerimeter());
        System.out.println("Type circle: " + shapeCircle.getType());
        Shape shapeRectangle = new Rectangle(4, 5);
        System.out.println("Area Rectangle: " + shapeRectangle.getArea());
        System.out.println("Perimeter Rectangle: " + shapeRectangle.getPerimeter());
        System.out.println("Type Rectangle: " + shapeRectangle.getType());
        Shape shapeSquare = new Square(10);
        System.out.println("Area Square: " + shapeSquare.getArea());
        System.out.println("Perimeter Square: " + shapeSquare.getPerimeter());
        System.out.println("Type Square: " + shapeSquare.getType());
    }
}
