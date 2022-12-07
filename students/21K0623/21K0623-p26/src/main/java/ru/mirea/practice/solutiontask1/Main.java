package ru.mirea.practice.solutiontask1;

import java.util.Arrays;
import java.util.Stack;

public final class Main {
    private Main() {}

    public static int[] reverseArray(int[] array) {
        Stack<Integer> integers = new Stack<>();
        for (int ints : array) {
            integers.push(ints);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = integers.pop();
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5, 6})));
    }
}
