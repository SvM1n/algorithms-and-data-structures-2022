package ru.mirea.practice.task1;

import java.util.Stack;

public abstract class Tester {
    public static void reverse(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            stack.push(j);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        print(arr);
        reverse(arr);
        print(arr);
    }
}
