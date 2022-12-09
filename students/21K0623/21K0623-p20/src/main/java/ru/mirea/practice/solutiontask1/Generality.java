package ru.mirea.practice.solutiontask1;

import java.io.Serializable;

public class Generality<T extends String, V extends Animal & Serializable, K> {
    private final T ten;
    private final V ven;
    private final K ken;

    public Generality(T ten, V ven, K ken) {
        this.ten = ten;
        this.ven = ven;
        this.ken = ken;
    }

    public T getTen() {
        return ten;
    }

    public V getVen() {
        return ven;
    }

    public K getKen() {
        return ken;
    }

    public void printName() {
        System.out.println(ten.getClass().getName());
        System.out.println(ven.getClass().getName());
        System.out.println(ken.getClass().getName());
    }
}
