package ru.mirea.practice.task10;

public abstract class Tester {
    public static void main(String[] args) {
        Computer[] arr = new Computer[3];
        Shop shop = new Shop(arr);
        shop.addComputers();
        System.out.println();
        shop.printComputers();
        shop.deleteComputer();
        System.out.println();
        shop.printComputers();
    }
}
