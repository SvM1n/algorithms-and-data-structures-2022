package ru.mirea.practice.program8;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(25, 9, "green", false);
        Square square1 = new Square(6, "blue", true);
        Circle circle1 = new Circle(10, "white", true);
        System.out.println(rectangle1);
        System.out.println(square1);
        System.out.println(circle1);
    }
}
