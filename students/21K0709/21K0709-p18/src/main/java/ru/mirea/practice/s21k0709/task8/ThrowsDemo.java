package ru.mirea.practice.s21k0709.task8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try (Scanner sc = new Scanner(System.in)) {
            String key;
            while (!"Stop".equals(sc.next())) {
                key = sc.next();
                printDetails(key);
            }
        }
    }

    public void printDetails(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (Exception e) {
            System.err.println(e);
            message = "Empty message";
        }
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        } else {
            return "data for " + key;
        }
    }
}