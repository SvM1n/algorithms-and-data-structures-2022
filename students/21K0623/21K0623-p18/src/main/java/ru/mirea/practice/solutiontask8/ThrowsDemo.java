package ru.mirea.practice.solutiontask8;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        try {
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception exc) {
            System.out.println("Введите снова");
            String key = myScanner.next();
            printDetails(key);
        } finally {
            myScanner.close();
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private String getDetails(String key) throws Exception {
        if (Objects.equals(key, "")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}

