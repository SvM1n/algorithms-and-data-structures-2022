package ru.mirea.practice.solutiontask4;

public class Tester implements Comparable {
    private final int numqueue;

    public Tester(int numqueue) {
        this.numqueue = numqueue;
    }

    @Override
    public int compareTo(Tester o) {
        return this.numqueue - o.numqueue;
    }
}
