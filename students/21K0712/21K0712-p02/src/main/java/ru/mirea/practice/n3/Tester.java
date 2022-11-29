package ru.mirea.practice.n3;

public class Tester {
    private int n = 0;
    private Circle[] a = new Circle[0];

    public Tester(int n, Circle[] a) {
        this.n = n;
        this.a = a;
    }

    public Tester() {
        this.n = 0;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Circle[] getA() {
        return a;
    }

    public void setA(Circle[] a) {
        this.a = a;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i <= n; i++) {
            s += a.toString();
        }
        return "Tester{"
                +
                "n=" + n
                +
                ", a=" + s
                +
                '}';
    }
}
