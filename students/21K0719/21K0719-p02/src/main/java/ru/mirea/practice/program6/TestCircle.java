package ru.mirea.practice.program6;

import java.util.Scanner;

abstract class TestCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Circle[] circles = new Circle[4];
            for (int i = 0; i < 4; i++) {
                circles[i] = new Circle();
                System.out.println(i + 1);
                System.out.println(": Enter X:");
                circles[i].setX(sc.nextInt());
                System.out.println("\n");
                System.out.println("Enter Y:");
                circles[i].setY(sc.nextInt());
                System.out.println("\n");
                System.out.println("Enter R:");
                circles[i].setR(sc.nextFloat());
            }
            System.out.println("Area of the 1 circle :");
            System.out.println(circles[0].findArea());
            System.out.println("length of the 1 circle :");
            System.out.println(circles[0].length());
            Circle.compare(new Circle(10, 1, 1), new Circle(5, 0, 0));
        }
    }
}
