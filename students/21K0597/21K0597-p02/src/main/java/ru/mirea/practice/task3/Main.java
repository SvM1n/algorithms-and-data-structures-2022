package ru.mirea.practice.task3;

public abstract class Main {
    public static void main(String[] args) {
        Tester test1 = new Tester();
        test1.addCircle(new Circle(3.0, new Point(0.0, 0.0)));
        test1.addCircle(new Circle(9.0, new Point(2.0, 2.0)));
        test1.show();
    }
}
