package ru.mirea.practice.task3;

import java.util.HashMap;
import java.util.Map;

public abstract class Main {
    public static void main(String[] args) {
        Map<Float, Integer> hashMap = new HashMap<>();
        hashMap.put(13f, 13);
        hashMap.put(12f, 12);
        hashMap.put(10f, 10);
        hashMap.put(8f, 8);
        hashMap.put(6f, 6);
        hashMap.put(123f, 123);

        System.out.println(hashMap);

    }
}

