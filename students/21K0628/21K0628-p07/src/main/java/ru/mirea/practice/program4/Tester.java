package ru.mirea.practice.program4;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(1, 1.732050807);
        System.out.println(mc1.pow(3));
        System.out.println(mc1.abs());
        System.out.println(mc1);
    }
}
