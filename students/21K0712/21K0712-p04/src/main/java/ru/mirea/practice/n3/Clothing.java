package ru.mirea.practice.n3;

public enum Clothing {
    SOCKS(1),
    SHIRT(2);
    private int num;

    Clothing(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
