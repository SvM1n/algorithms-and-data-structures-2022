package mirea.practice.task1;

import java.util.Stack;

public abstract class ListReverse {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Stack<Integer> stack = new Stack<>();

        for (int j : inputArray) {
            stack.push(j);
        }

        int[] outputArray = new int[inputArray.length];

        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = stack.pop();
        }

        for (int value : outputArray) {
            System.out.print(value + " ");
        }
    }
}
