package ru.mirea.practice.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Tester {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Введите количество окружностей:");
            int counter = 0;
            if (scn.hasNextInt()) {
                counter = scn.nextInt();
            }
            Circle[] array = new Circle[counter];
            for (int i = 0; i < counter; i++) {
                System.out.println("Введите координаты центр. точки:");
                Circle circle = new Circle(scn.nextInt(), scn.nextInt());
                array[i] = circle;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
