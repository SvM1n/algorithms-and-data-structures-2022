package ru.mirea.practice.task4;

public class Computer {
    private Brand brand;
    private Memory memory;
    private Monitor monitor;
    private Processor processor;

    public Computer(Brand brand, Memory memory, Monitor monitor, Processor processor) {
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + "\nMemory: " + memory + "\nMonitor: " + monitor + "\nProcessor: " + processor;
    }
}
