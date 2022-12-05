package ru.mirea.practice.solutiontask1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Circle first = new Circle(10.5);
        Rectangle second = new Rectangle(12, 12, 12);
        Square third = new Square(7);
        System.out.println(first);
        System.out.println(first.getArea());
        System.out.println(first.getPerimeter());
        System.out.println(first.getType());
        System.out.println(second);
        System.out.println(second.getArea());
        System.out.println(second.getPerimeter());
        System.out.println(second.getType());
        System.out.println(third);
        System.out.println(third.getArea());
        System.out.println(third.getPerimeter());
        System.out.println(third.getType());
    }
}
