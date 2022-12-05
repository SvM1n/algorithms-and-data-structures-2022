package ru.mirea.worktwentysix.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public abstract class Test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }

        for (int i = arr.size() - 1; i > 0; i--) {
            stack.push(arr.get(i));
        }
        arr = stack;
        System.out.println(arr);
    }
}

