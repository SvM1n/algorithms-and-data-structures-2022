package ru.mirea.worktwenty;

public class GenericBox<T, V extends Animal, K extends Number> implements Comparable<T> {
    private T contentT;
    private V contentV;
    private K contentK;

    public GenericBox(T contentT, V contentV, K contentK) {
        this.contentT = contentT;
        this.contentV = contentV;
        this.contentK = contentK;
    }

    public T getContentT() {
        return contentT;
    }

    public void setContentT(T contentT) {
        this.contentT = contentT;
    }

    public V getContentV() {
        return contentV;
    }

    public void setContentV(V contentV) {
        this.contentV = contentV;
    }

    public K getContentK() {
        return contentK;
    }

    public void setContentK(K contentK) {
        this.contentK = contentK;
    }

    public void printClasses() {
        System.out.println(this.contentT.getClass());
        System.out.println(this.contentV.getClass());
        System.out.println(this.contentK.getClass());
    }

    @Override
    public int compareTo(T o) {
        if (o.equals(this)) {
            return 1;
        }
        return 0;
    }
}
