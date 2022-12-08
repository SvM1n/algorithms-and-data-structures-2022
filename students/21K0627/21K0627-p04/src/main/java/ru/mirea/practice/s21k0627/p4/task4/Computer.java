package ru.mirea.practice.s21k0627.p4.task4;

public class Computer {
    int price;
    Brand brand;
    Processor processor;
    Monitor monitor;
    Memory memory;

    Computer(int price, Brand brand, Processor processor, Monitor monitor, Memory memory) {
        this.price = price;
        this.brand = brand;
        this.processor = processor;
        this.monitor = monitor;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nPrice: " + price + "\nProcessor: " + processor
                + "\nMonitor: " + monitor + "\nMemory: " + memory;
    }
}