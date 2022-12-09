package ru.mirea.practice.task4;

import java.util.Scanner;

abstract class Shop {
    public static void addComputer(Computer[] arr) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Name: ");
                Computer comp = new Computer();
                comp.setName(sc.nextLine());
                arr[i] = comp;
            }
        }
    }

    public static void deleteComputer(Computer[] arr) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Name: ");
            String deleteName = new String();
            deleteName = sc.nextLine();
            for (Computer computer : arr) {
                if (computer.getName().equals(deleteName)) {
                    computer.setName(" ");
                }
            }
        }
    }
}
