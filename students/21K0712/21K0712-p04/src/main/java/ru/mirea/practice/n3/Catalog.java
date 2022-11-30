package ru.mirea.practice.n3;

public enum Catalog {
    CLOTHING(1),
    FURNITURE(2);
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    Catalog(int num) {
        this.num = num;
    }
}
