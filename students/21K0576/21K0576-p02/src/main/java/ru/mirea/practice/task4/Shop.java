package ru.mirea.practice.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Shop {
    public static void addComputer() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите название компьютера: ");
            String val = sc.nextLine();
            _computers.add(val);
        }
    }

    public static void addComputer(String name) {
        _computers.add(name);
    }

    public static void removeComputer(String name) {
        _computers.remove(findComputer(name));
    }

    public static int findComputer(String name) {
        return _computers.indexOf(name);
    }

    public static void printComputers() {
        System.out.println("Компьютеры:");
        for (String pc : _computers) {
            System.out.println("\t" + pc);
        }
    }

    static List<String> _computers = new ArrayList<>();
}
