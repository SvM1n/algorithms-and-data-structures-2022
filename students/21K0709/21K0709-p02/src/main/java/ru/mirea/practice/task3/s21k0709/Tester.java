package ru.mirea.practice.task3.s21k0709;

import java.util.Scanner;

public abstract class Tester {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j = 0; // кол-во эл массива
            do {
                System.out.println("Введите кол-во элементов массива: ");
                if (sc.hasNextInt()) {
                    j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (j < 0);
            Circle[] mas = new Circle[j];
            for (int i = 0; i < mas.length; i++) {
                System.out.println("Введите x: ");
                float x = sc.nextFloat();
                System.out.println("Введите y: ");
                float y = sc.nextFloat();
                System.out.println("Введите r: ");
                float r = sc.nextFloat();
                mas[i] = new Circle(new Point(x, y), r);
            }
            for (Circle i: mas) {
                System.out.println(i);
            }
        }
    }
}
