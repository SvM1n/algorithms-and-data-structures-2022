package ru.mirea.practice.task4;

abstract class Tester4 {
    private static final int N = 3;

    public static void main(String[] args) {
        Computer[] arr = new Computer[N];
        Shop.addComputer(arr);
        for (Computer computer : arr) {
            System.out.print(computer.getName() + ", ");
        }
        System.out.println("\n");
        Shop.deleteComputer(arr);
        for (Computer computer : arr) {
            System.out.print(computer.getName() + ", ");
        }
    }
}
