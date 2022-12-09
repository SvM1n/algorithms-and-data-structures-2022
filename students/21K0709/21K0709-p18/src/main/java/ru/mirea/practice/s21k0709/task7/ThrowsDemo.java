package ru.mirea.practice.s21k0709.task7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try (Scanner sc = new Scanner(System.in)) {
            while (!"".equals(sc.next()) || sc.next() == null) {
                String key = sc.next();
                printDetails(key);
            }
        }

    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}