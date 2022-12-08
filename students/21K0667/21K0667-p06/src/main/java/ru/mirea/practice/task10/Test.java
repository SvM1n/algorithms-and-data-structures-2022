package ru.mirea.practice.task10;

public abstract class Test {
    public static void main(String[] args) {
        Computer[] test = new Computer[2];
        Shop shop = new Shop(test);
        shop.addComputers();
        System.out.println();
        shop.printComputers();
        System.out.println();
        shop.deleteComputer();
        System.out.println();
        shop.printComputers();
    }

}
