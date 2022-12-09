package ru.mirea.practice.n2;

import java.util.LinkedList;
import java.util.Queue;

abstract class Main {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();
        num.offer(1);
        num.offer(2);
        num.offer(3);
        System.out.println("Queue: " + num);
        int removedNumber = num.poll();
        System.out.println("Removed Element: " + removedNumber);
        System.out.println("Queue after deletion: " + num);
    }
}
