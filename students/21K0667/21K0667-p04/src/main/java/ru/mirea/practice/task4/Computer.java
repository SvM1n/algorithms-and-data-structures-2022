package ru.mirea.practice.task4;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brand brand;

    public Computer(Processor processor, Memory memory, Monitor monitor, Brand brand) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Процессор: " + processor
                + ", Память: " + memory
                + ", Монитор" + monitor
                + ", Бренд:" + brand;
    }
}

