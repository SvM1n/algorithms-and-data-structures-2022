package ru.mirea.practice.program3;

abstract class Tester {
    public static void main(String[] args) {
        int size = 4;
        Circle[] arr = new Circle[size];
        arr[0] = new Circle(1, 1, 5);
        arr[1] = new Circle(1, -6, 6);
        arr[2] = new Circle(10, 5, 100);
        arr[3] = new Circle(5, 4, 9);
        for (Circle cir : arr) {
            System.out.println(cir);
            System.out.println("\n");
        }
    }
}
