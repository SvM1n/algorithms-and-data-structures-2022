package ru.mirea.practice.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public abstract class ListComparison {
    public static void main(String[] args) {
        int streamSize = 50000000;
        int[] list = new Random().ints(streamSize, 10, 1000).toArray();

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("СОЗДАНИЕ МАССИВА: ");
        long startTimer = System.currentTimeMillis();
        for (int j : list) {
            arrayList.add(j);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTimer) + " ms");

        startTimer = System.currentTimeMillis();
        for (int j : list) {
            linkedList.add(j);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTimer) + " ms");

        System.out.println("ДОБАВЛЕНИЕ ЭЛЕМЕНТА");
        System.out.println("ArrayList: ");
        startTimer = System.currentTimeMillis();
        arrayList.add(1, 45);
        System.out.println("в начало - " + (System.currentTimeMillis() - startTimer) + " ms");
        startTimer = System.currentTimeMillis();
        arrayList.add(streamSize / 2, 45);
        System.out.println("в середину - " + (System.currentTimeMillis() - startTimer) + " ms");
        startTimer = System.currentTimeMillis();
        arrayList.add(streamSize - 1, 45);
        System.out.println("в конец - " + (System.currentTimeMillis() - startTimer) + " ms");

        System.out.println("LinkedList: ");
        startTimer = System.currentTimeMillis();
        linkedList.add(1, 45);
        System.out.println("в начало - " + (System.currentTimeMillis() - startTimer) + " ms");
        startTimer = System.currentTimeMillis();
        linkedList.add(streamSize / 2, 45);
        System.out.println("в середину - " + (System.currentTimeMillis() - startTimer) + " ms");
        startTimer = System.currentTimeMillis();
        linkedList.add(streamSize - 1, 45);
        System.out.println("в конец - " + (System.currentTimeMillis() - startTimer) + " ms");

        System.out.println("УДАЛЕНИЕ ЭЛЕМЕНТА");
        startTimer = System.currentTimeMillis();
        arrayList.remove(streamSize / 2);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTimer) + " ms");

        startTimer = System.currentTimeMillis();
        linkedList.remove(streamSize / 2);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTimer) + " ms");

        System.out.println("ПОИСК ЭЛЕМЕНТА");
        startTimer = System.currentTimeMillis();
        arrayList.contains(340);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - startTimer) + " ms");

        startTimer = System.currentTimeMillis();
        linkedList.contains(340);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - startTimer) + " ms");
    }
}
