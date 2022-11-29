package ru.mirea.practice.n9;

abstract class Furniture {
    protected int countoflegs;
    protected String size;

    protected Furniture(String size, int countoflegs) {
        this.size = size;
        this.countoflegs = countoflegs;
    }
}
