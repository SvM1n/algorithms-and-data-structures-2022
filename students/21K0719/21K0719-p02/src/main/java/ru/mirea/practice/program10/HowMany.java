package ru.mirea.practice.program10;

import java.util.Scanner;

abstract class HowMany {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String words = "";
            words = sc.nextLine();
            int counter = 0;
            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {
                    counter++;
                }
            }
            counter++;
            System.out.print(counter);
        }
    }
}
