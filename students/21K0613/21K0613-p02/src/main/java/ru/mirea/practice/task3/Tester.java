package ru.mirea.practice.task3;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Tester {
    private int counter;

    public void main(String[] array) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Введите количество окружностей:");
            if (scn.hasNextInt()) {
                counter = scn.nextInt();
            }
            Circle[] mass = new Circle[counter];
            for (int i = 0; i < counter; i++) {
                System.out.println("Введите координаты центр. точки:");
                Circle circle = new Circle(scn.nextInt(), scn.nextInt());
                mass[i] = circle;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
