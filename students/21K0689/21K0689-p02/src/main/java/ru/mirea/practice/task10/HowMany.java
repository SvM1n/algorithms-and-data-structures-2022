package ru.mirea.practice.task10;


import java.util.Scanner;

public abstract class HowMany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            String input = scan.nextLine();
            int c = 0;
            if (input.length() != 0) {
                c++;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ' ') {
                        c++;
                    }
                }
            }
            System.out.println(c);
        } finally {
            scan.close();
        }
    }
}

