package ru.mirea.practice;

import java.util.Scanner;

abstract class One5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите числоб факториал которого вы желаете найти: ");
            int num = sc.nextInt();
            int fact = 1;
            for (int i = num; i > 0; i--) {
                fact *= i;
            }
            System.out.print("Факториал числа ");
            System.out.print(num);
            System.out.print(" = ");
            System.out.print(fact);
        }
    }
}
