package ru.mirea.practice.s21k0709.mathrandom.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public abstract class Tester {
    public static void findMaxCircle(Circle[] mas,int colel) {

        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < colel; i++) {
            list.add(mas[i].getR());
        }
        Collections.sort(list);
        System.out.println("Окружность с r = " + list.get(colel - 1) + " - наибольшая");
    }

    public static void findMinCircle(Circle[] mas,int colel) {
        ArrayList<Double> list = new ArrayList<Double>();
        for (int i = 0; i < colel; i++) {
            list.add(mas[i].getR());
        }
        Collections.sort(list);
        System.out.println("Окружность с r = " + list.get(0) + " - наименьшая");
    }

    public static Circle[] sortL(Circle[] mas,int colel) {
        for (int i = 0; i < colel; i++) {
            for (int j = 0; j < colel - i - 1;j++) {
                if (mas[j].getL() > mas[j + 1].getL()) {
                    Circle k = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = k;
                }
            }
        }
        return mas;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j = 0;
            do {
                System.out.println("Введите кол-во элементов массива: ");
                if (sc.hasNextInt()) {
                    j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (j < 0);
            Circle[] mas = new Circle[j];
            Random rand = new Random();
            for (int i = 0; i < mas.length; i++) {
                float x = 1 + rand.nextInt(10);
                float y = 1 + rand.nextInt(10);
                float r = 1 + rand.nextInt(10);
                double l;
                l = 2 * Math.PI * r;
                System.out.print(x + " " + y + " " + r + " " + l);
                System.out.println();
                mas[i] = new Circle(new Point(x, y), r, l);
            }
            for (Circle i : mas) {
                System.out.println(i);
            }
            findMaxCircle(mas, mas.length);
            findMinCircle(mas, mas.length);
            sortL(mas, mas.length); // сортируем по длине окружности
            for (Circle i : mas) {
                System.out.println(i);
            }
        }
    }

}
