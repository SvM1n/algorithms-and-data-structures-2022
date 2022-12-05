package ru.mirea.practice.s21k0709.p4.task4;

public class Memory {
    int memoryreadonly;
    int memoryreadrecord;
    int speed;

    Memory(int memoryreadonly, int memoryreadrecord, int speed) {
        this.memoryreadonly = memoryreadonly;
        this.memoryreadrecord = memoryreadrecord;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Memory read only: " + this.memoryreadonly + " \n" + "Memory read-record: " + this.memoryreadrecord + " \n" + "Speed: " + this.speed;
    }
}