package ru.mirea.practice.task5;

import java.util.Scanner;

abstract class Program5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int a = sc.nextInt();
            System.out.print(Factorial.factor(a));
        }
    }
}
