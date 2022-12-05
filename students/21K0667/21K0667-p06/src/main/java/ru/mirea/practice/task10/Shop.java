package ru.mirea.practice.task10;

import java.util.Scanner;

public class Shop implements Inputable  {
    private Computer[] computers;

    public Shop(Computer[] computers) {
        this.computers = computers;
    }

    public void printComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }

    }

    @Override
    public void addComputers() {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < computers.length; i++) {
                System.out.print("Введите бренд (LENOVO, DEXP, HP): ");
                Computer tempComputer = new Computer(Brand.valueOf(sc.nextLine()));
                computers[i] = tempComputer;
            }
        }
    }

    public void deleteComputer() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите индекс компьютера для удаления: ");
            int tempIndex = sc.nextInt() - 1;
            for (int i = 0; i < computers.length; i++) {
                if (i == tempIndex) {
                    Computer tempComputer = new Computer(new Processor(0, 0, 0), new Memory(0, 0),
                            new Monitor(0, "0x0"));
                    computers[i] = tempComputer;
                }
            }
        }
    }
}