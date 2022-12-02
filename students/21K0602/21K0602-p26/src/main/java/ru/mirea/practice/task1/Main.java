package ru.mirea.practice.task1;

import java.util.Arrays;
import java.util.Stack;

public abstract class Main {
    public static int[] reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int ints : array) {
            stack.push(ints);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            array[i] = stack.pop();
            i++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array before reverse:\n" + Arrays.toString(array));
        array = reverseArray(array);
        System.out.println("Array after:\n" + Arrays.toString(array));
    }
}
