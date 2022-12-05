package ru.mirea.practice.task4;

abstract class Tester {
    public static void main(String[] args) {
        Shop.addComputer("first pc");
        Shop.addComputer("second pc");
        Shop.addComputer("third pc");
        Shop.printComputers();
        Shop.removeComputer("second pc");
        System.out.println("Удалён \"second pc\"");
        Shop.printComputers();
        Shop.addComputer();
        System.out.printf("second pc - %d элемент массива\n", Shop.findComputer("third pc"));
        Shop.printComputers();
    }
}
