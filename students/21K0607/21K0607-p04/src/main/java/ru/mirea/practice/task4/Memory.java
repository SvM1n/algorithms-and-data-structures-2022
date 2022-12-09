package ru.mirea.practice.task4;

public class Memory {
    private int ramCapacity; // гб
    private int ssdCapacity; // гб
    private int hddCapacity; // гб

    public Memory(int ramCapacity, int ssdCapacity, int hddCapacity) {
        this.hddCapacity = hddCapacity;
        this.ssdCapacity = ssdCapacity;
        this.ramCapacity = ramCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public void setRamCapacity(int ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public void setSsdCapacity(int ssdCapacity) {
        this.ssdCapacity = ssdCapacity;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public int getRamCapacity() {
        return ramCapacity;
    }

    public int getSsdCapacity() {
        return ssdCapacity;
    }

    @Override
    public String toString() {
        return "Memory{" + "ramCapacity=" + ramCapacity + ", ssdCapacity=" + ssdCapacity + ", hddCapacity=" + hddCapacity + '}';
    }
}
