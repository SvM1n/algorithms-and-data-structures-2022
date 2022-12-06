package ru.mirea.practice.n1to3;

abstract class Three<T, V, K> extends Animal<K> implements Comparable<T> {
    private T var1;
    private V var2;
    private K var3;

    Three(T t, V v, K k) {
        var1 = t;
        var2 = v;
        var3 = k;
    }

    public T getVar1() {
        return var1;
    }

    public void setVar1(T var1) {
        this.var1 = var1;
    }

    public V getVar2() {
        return var2;
    }

    public void setVar2(V var2) {
        this.var2 = var2;
    }

    public K getVar3() {
        return var3;
    }

    public void setVar3(K var3) {
        this.var3 = var3;
    }

    @Override
    public String toString() {
        return "Three{"
                +
                "var1=" + var1
                +
                ", var2=" + var2
                +
                ", var3=" + var3
                +
                '}';
    }
}
