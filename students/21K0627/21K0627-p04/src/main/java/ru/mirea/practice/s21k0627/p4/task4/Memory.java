package ru.mirea.practice.s21k0627.p4.task4;

public class Memory {
    int size;
    int tact;

    Memory(int size, int tact) {
        this.size = size;
        this.tact = tact;
    }

    @Override
    public String toString() {
        return "size of memory: " + this.size + ", tact frequency: " + this.tact;
    }
}