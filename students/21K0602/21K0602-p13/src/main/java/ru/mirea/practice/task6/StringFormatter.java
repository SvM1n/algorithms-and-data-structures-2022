package ru.mirea.practice.task6;


import java.util.Queue;

import java.util.Arrays;

import java.util.ArrayDeque;

import java.util.Set;

import java.util.HashSet;

import java.util.Locale;

public class StringFormatter {

    private String[] strings;

    public StringFormatter(String[] str) {
        this.strings = str;
    }

    public String getLine() {
        Queue<String> queue = new ArrayDeque<>(Arrays.asList(strings));
        Set<String> added = new HashSet<>();
        added.add(queue.peek());
        StringBuilder stringBuilder = new StringBuilder(queue.remove());
        boolean flag = true;

        while (!queue.isEmpty() && flag) {
            flag = false;
            int i = 0;
            for (; i < queue.size(); i++) {
                String str = queue.remove();
                if (added.contains(str)) {
                    continue;
                }
                if (str.startsWith(stringBuilder.substring(stringBuilder.length() - 1).toLowerCase(Locale.ROOT))) {
                    stringBuilder.append(" ").append(str);
                    flag = true;
                    added.add(str);
                    break;
                }
                queue.add(str);
            }


        }
        return stringBuilder.toString();

    }

    @Override
    public String toString() {
        return "StringFormatter{" + "str='" + Arrays.toString(strings) + '\'' + '}';
    }
}
