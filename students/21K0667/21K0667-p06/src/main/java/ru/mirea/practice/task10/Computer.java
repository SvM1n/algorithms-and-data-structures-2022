package ru.mirea.practice.task10;

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

    public Computer(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Computer(Brand brand) {
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

