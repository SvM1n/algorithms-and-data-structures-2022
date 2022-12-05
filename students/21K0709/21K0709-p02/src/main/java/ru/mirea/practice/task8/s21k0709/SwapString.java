package ru.mirea.practice.task8.s21k0709;

import java.util.Scanner;

public abstract class SwapString {
    public static void swapElem(String[] list) {
        for (int i = 0; i < list.length / 2; i++) {
            String t = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = t;
        }
        for (String i: list) {
            System.out.printf(i);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int j = 0;
            do {
                System.out.println("Введите кол-во объектов ");
                if (sc.hasNextInt()) {
                    j = sc.nextInt(); //считывает целое число из поток ввода и сохраняет в переменную
                }
            } while (j < 0);
            String[] list = new String[j];
            System.out.println("Введите объекты::");
            for (int i = 0; i < j; i++) {
                String name;
                name = sc.next();
                list[i] = name;
            }
            for (String i : list) {
                System.out.println(i);
            }
            swapElem(list);
        }
    }
}
