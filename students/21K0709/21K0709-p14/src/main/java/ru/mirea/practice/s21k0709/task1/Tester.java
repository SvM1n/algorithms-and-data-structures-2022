package ru.mirea.practice.s21k0709.task1;

import java.util.Scanner;
import java.util.StringTokenizer;

public abstract class Tester {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        try (Scanner sc = new Scanner(System.in)) {
            StringTokenizer tokenizer = new StringTokenizer(sc.nextLine(), "|;,./ ");
            String[] strings = new String[tokenizer.countTokens()];
            for (int i = 0; i < strings.length; i++) {
                if (tokenizer.hasMoreTokens()) {
                    strings[i] = tokenizer.nextToken().replace(" ", "");
                }
                System.out.println(strings[i]);
            }
        }
    }
}