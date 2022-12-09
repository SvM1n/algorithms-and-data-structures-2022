package ru.mirea.practice.task2;

/* Создать массив вещественных чисел случайным образом, вывести его
на экран, отсортировать его, и снова вывести на экран (использовать два подхода
к генерации случайных чисел – метод random() класса Math и класс Random) */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class Task2 {

    private Task2() {
    }

    public static void main(String[] args) {

        int size = 10;

        List<Integer> integerList1 = new ArrayList<>(size);

        Random rd = new Random();

        for (int i = 0; i < size; i++) {
            integerList1.add(rd.nextInt(10));
        }
        System.out.println(integerList1);

        Collections.sort(integerList1);
        System.out.println(integerList1);


        List<Integer> integerList2 = new ArrayList<>(10);

        for (int i = 0; i < size; i++) {
            integerList2.add((int) (Math.random() * 10));
        }
        System.out.println(integerList2);

        Collections.sort(integerList2);
        System.out.println(integerList1);

    }
}
