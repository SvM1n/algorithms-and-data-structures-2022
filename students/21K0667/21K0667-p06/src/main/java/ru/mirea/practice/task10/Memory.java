package ru.mirea.practice.task10;

public class Memory {
    private int ramCapacity;
    private int hddCapacity;

    public Memory(int ramCapacity, int hddCapacity) {
        this.ramCapacity = ramCapacity;
        this.hddCapacity = hddCapacity;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    @Override
    public String toString() {
        return "Объем ОЗУ:" + ramCapacity
                + ", Объем жесткого диска: " + hddCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }
}


