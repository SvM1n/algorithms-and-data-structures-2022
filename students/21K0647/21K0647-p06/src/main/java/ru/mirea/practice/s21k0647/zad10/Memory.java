package ru.mirea.practice.s21k0647.zad10;

public class Memory {
    int memoryReadOnly;
    int memoryReadRecord;
    int speed;

    Memory(int memoryReadOnly, int memoryReadRecord, int speed) {
        this.memoryReadOnly = memoryReadOnly;
        this.memoryReadRecord = memoryReadRecord;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Memory read only " + memoryReadOnly + "\nMemory read-record " + memoryReadRecord + "\nSpeed " + speed;
    }

}
