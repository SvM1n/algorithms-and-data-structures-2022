package ru.mirea.practice.task10;

import java.util.Scanner;

abstract class HowManyJava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a = new String();

            System.out.println("Line: ");
            a = sc.nextLine();
            int count = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == ' ') {
                    count++;
                }
            }
            count++;
            System.out.print(count);
        }
    }
}
