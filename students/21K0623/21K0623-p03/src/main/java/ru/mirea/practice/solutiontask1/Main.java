package ru.mirea.practice.solutiontask1;

import java.util.Random;
import java.util.Scanner;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите кол-во чисел: ");
            int temp = sc.nextInt();
            Random rand = new Random();
            double[] mass = new double[temp];
            double[] masssec = new double[temp];

            for (int i = 0; i < temp; i++) {
                mass[i] = Math.random();
                masssec[i] = rand.nextDouble();
            }
            System.out.println("----Math.random()----");
            printMass(mass);
            System.out.println("----rand.random()----");
            printMass(masssec);


            System.out.println("----Math.random()----");
            printMass(sortMass(mass));
            System.out.println("----rand.random()----");
            printMass(sortMass(masssec));
        }
    }

    public static void printMass(double[] mass) {
        for (double x : mass) {
            System.out.print(x + " ");
        }
        System.out.print('\n');
    }

    public static double[] sortMass(double[] mass) {
        int i = 0;
        while (i < mass.length) {
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] > mass[j + 1]) {
                    double temp = mass[j];
                    mass[j] = mass[j + 1];
                    mass[j + 1] = temp;
                }
            }
            i++;
        }
        return mass;
    }
}
