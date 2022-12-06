package ru.mirea.practice.n1;

import java.util.Scanner;

abstract class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Test work = new Test(" ", " ");
            //123456789012
            System.out.println("Введите ФИО");
            work.setName(scanner.next());

            System.out.println("Введите ИНН");
            try {
                work.setInn();
            } catch (InnException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(" ");
        } finally {
            scanner.close();
        }
    }
}
