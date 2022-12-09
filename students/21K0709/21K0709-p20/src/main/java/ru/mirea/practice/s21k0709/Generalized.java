package ru.mirea.practice.s21k0709;

import java.io.Serializable;

public class Generalized<T extends Comparable,V extends Animal & Serializable,K> {
    private T t;
    private V v;
    private K k;

    public Generalized(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public String getTName() {
        return  t.getClass().getName();
    }

    public String getVName() {
        return v.getClass().getName();
    }

    public String getKName() {
        return k.getClass().getName();
    }

    @Override
    public String toString() {
        return "Generalized{"
                +
                "t=" + t
                +
                ", v=" + v
                +
                ", k=" + k
                +
                '}';
    }
}