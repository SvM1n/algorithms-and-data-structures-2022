package ru.mirea.practice;

import java.util.Scanner;

abstract class One2 {
    public static void main(String[] args) {
        int maslet;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Введите размер массива в виде целого числа");
                maslet = sc.nextInt();
            } while (maslet <= 0);
            int[] mas = new int[maslet];
            int massum = 0;
            int ln = 0;
            System.out.println("Введите целое значение массива: ");
            while (ln < maslet) {
                mas[ln] = sc.nextInt();
                massum += mas[ln];
                ln++;
            }
            System.out.print("Сумма значений равна ");
            System.out.println(massum);
            int masmin = mas[0];
            int masmax = mas[0];
            ln = 1;
            while (ln < maslet) {
                if (mas[ln] < masmin) {
                    masmin = mas[ln];
                } else if (mas[ln] > masmax) {
                    masmax = mas[ln];
                }
                ln++;
            }
            System.out.print("Минимальное число — ");
            System.out.println(masmin);
            System.out.print("Максимальное число — ");
            System.out.print(masmax);
        }
    }
}
