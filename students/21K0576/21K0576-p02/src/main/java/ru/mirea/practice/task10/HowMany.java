package ru.mirea.practice.task10;

import java.util.Scanner;

abstract class HowMany {
    public static void main(String[] args) {
        String text;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите предложения:");
            text = sc.nextLine();
        }

        int counter = 0;
        try (Scanner sc = new Scanner(text)) {
            while (sc.hasNext()) {
                sc.next();
                ++counter;
            }
        }
        System.out.println(counter);
    }
}
