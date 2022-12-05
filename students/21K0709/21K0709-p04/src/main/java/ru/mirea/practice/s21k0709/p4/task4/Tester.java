package ru.mirea.practice.s21k0709.p4.task4;

public final class Tester {
    private Tester() {}

    public static void main(String[] args) {
        Computer computer1 = new Computer(Mark.Asus, 55000,
                new Monitor(23, 250),
                new Memory(1024, 64, 12),
                new Proccesor(6, 3000, 117));
        System.out.println(computer1);
    }
}