package ru.mirea.practice.task123;

public abstract class Main {
    public static void main(String[] args) {
        Triangular triangular = new Triangular();
        triangular.getFirstN(10);
        getN(10);
        System.out.println("");
        fromAtoB(10, -20);
    }

    public static void getN(int n) {
        if (n > 0) {
            getN(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void fromAtoB(int a, int b) {
        if (a > b) {
            System.out.print(b + " ");
            fromAtoB(a, b + 1);
        }
        if (a < b) {
            System.out.print(a + " ");
            fromAtoB(a + 1, b);
        }
        if (a == b) {
            System.out.print(a + " ");
        }
    }
}