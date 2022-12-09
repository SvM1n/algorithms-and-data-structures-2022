package ru.mirea.practice.program1;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle(11.7);
        Rectangle rectangle = new Rectangle(9.4, 8.5);
        Square square = new Square(3.4);
        System.out.println(circle);
        System.out.println("S= " + circle.getArea()
                + "\nP= " + circle.getPerimeter()
                + "\nName: " + circle.getType() + '\n');
        System.out.println(rectangle);
        System.out.println("S= " + rectangle.getArea()
                + "\nP= " + rectangle.getPerimeter()
                + "\nName: " + rectangle.getType() + '\n');
        System.out.println(square);
        System.out.println("S= " + square.getArea()
                + "\nP= " + square.getPerimeter()
                + "\nName: " + square.getType() + '\n');
    }
}
