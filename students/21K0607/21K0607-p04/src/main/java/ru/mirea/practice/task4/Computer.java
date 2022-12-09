package ru.mirea.practice.task4;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand) {
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "processor=" + "Computer{" + processor + ", memory=" + memory + ", monitor=" + monitor + ", brand=" + brand + '}';
    }
}
