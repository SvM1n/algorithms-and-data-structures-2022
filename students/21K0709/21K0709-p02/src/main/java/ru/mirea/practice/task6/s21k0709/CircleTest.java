package ru.mirea.practice.task6.s21k0709;

public abstract class CircleTest {
    public static void main(String[] args) {
        Circle obj1 = new Circle(1, 1, 10, "green");
        Circle obj2 = new Circle(2, 3, 4, "blue");
        System.out.println(obj1.areaCircle());
        System.out.println(obj1.lengthCircle());
        System.out.println(obj1);
        System.out.println(obj1.maxCircle(obj1, obj2));
    }
}
