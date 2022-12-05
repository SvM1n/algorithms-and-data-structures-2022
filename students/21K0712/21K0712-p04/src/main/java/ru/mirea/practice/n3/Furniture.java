package ru.mirea.practice.n3;

public enum Furniture {
    CHAIR(1),
    TABLE(2);
    private int num;

    Furniture(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
