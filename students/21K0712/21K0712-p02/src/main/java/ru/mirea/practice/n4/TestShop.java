package ru.mirea.practice.n4;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class TestShop {
    public static void main(String[] args) {
        Shop sh = new Shop(10);

        System.out.println(sh);

        Scanner scanner = new Scanner(System.in);
        try {
            int a;
            System.out.print("Введите номер компьютера (1-10): ");
            a = scanner.nextInt();

            sh.findComputer(a);
            sh.addComputer(3);
            sh.delComputer(6);
            sh.findComputer(7);
            System.out.println(sh.getCounter());
            sh.setCounter(5);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}