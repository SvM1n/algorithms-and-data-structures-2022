package ru.mirea.practice.task1to3;

import java.io.Serializable;

public class GenericBox<T extends Comparable, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public GenericBox(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void names() {
        System.out.print("T: " + t.getClass().toString());
        System.out.print("\nV: " + v.getClass().toString());
        System.out.print("\nK: " + k.getClass().toString());
    }

    @Override
    public String toString() {
        return "GenericBox{"
                + "t=" + t
                + ", v=" + v
                + ", k=" + k
                + '}';
    }
}
