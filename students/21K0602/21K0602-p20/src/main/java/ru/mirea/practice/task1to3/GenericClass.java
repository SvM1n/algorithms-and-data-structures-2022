package ru.mirea.practice.task1to3;



import java.io.Serializable;

public class GenericClass<T extends Comparable,V extends Animal & Serializable,K> {
    private T tcontent;
    private V vcontent;
    private K kcontent;

    public GenericClass(T tcontent, V vcontent, K kcontent) {
        this.tcontent = tcontent;
        this.vcontent = vcontent;
        this.kcontent = kcontent;
    }

    public T getTcontent() {
        return tcontent;
    }

    public V getVcontent() {
        return vcontent;
    }

    public K getKcontent() {
        return kcontent;
    }

    public String getTcontentName() {
        return  tcontent.getClass().getName();
    }

    public String getVcontentName() {
        return vcontent.getClass().getName();
    }

    public String getKcontentName() {
        return kcontent.getClass().getName();
    }

    @Override
    public String toString() {
        return "GenericClass{" + "tContent=" + tcontent + ", vContent=" + vcontent + ", kContent=" + kcontent + '}';
    }
}
