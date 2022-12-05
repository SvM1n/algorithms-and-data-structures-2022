package ru.mirea.practice.task3;

public abstract class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();
        Circle circle1 = new Circle();
        circle1.setCenter(new Point(2.1, 1.2));
        circle1.setRadius(20);
        tester.addCircle(circle1);
        tester.print();
    }
}
