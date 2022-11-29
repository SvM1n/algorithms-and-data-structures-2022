package ru.mirea.practice.n6;

abstract class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());
        c.setRadius(15);
        Circle c1 = new Circle(1, 2, 5);
        System.out.println("c >= c1 ? " + c.compare(c1));

    }
}
