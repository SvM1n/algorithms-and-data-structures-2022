package ru.mirea.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите число\t");
        Scanner scn = new Scanner(System.in);
        try {
            int num = 0;
            if (scn.hasNextInt()) {
                num = scn.nextInt();
            }
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            System.out.println("Факториал числа:\t" + result);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scn.nextInt();
        } finally {
            scn.close();
        }
    }
}
