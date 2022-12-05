package ru.mirea.practice;

import java.util.Scanner;
abstract class Task3 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Введите количество чисел\t");
        Scanner scn = new Scanner(System.in);
        int numCount = 0;
        if (scn.hasNextInt()) {
            numCount = scn.nextInt();
        }
        int[] array = new int[numCount];
        System.out.println("Начинайте вводить числа:\t");
        for (int i = 0; i < numCount; i++) {
            int num = 0;
            if (scn.hasNextInt()) {
                num = scn.nextInt();
            }
            array[i] = num;
            sum += num;
        }
        System.out.println("Сумма чисел\t" + sum + "\n" + "Среднее арифметическое\t" + (sum/numCount));
    }
}
