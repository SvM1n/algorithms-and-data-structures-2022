package ru.mirea.practice.task10.s21k0627;

import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        System.out.print("enter line: ");

        try (Scanner sc = new Scanner(System.in)) {
            if (sc.hasNextLine()) {
                int count = 1;
                String line = sc.nextLine();
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ' ') {
                        count++;
                    }
                }
                System.out.printf("you enter %s words", count);
            } else {
                System.out.print("you don't enter line");
            }
        }
    }
}