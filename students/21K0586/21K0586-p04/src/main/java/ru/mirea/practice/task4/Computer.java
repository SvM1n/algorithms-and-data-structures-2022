package ru.mirea.practice.task4;

import ru.mirea.practice.task4.memory.Memory;

public class Computer {
    private Memory memory;
    private Processor processor;
    private Monitor monitor;
    private final Type type;
    private final Brand brand;

    public Computer(Type type, Brand brand, Memory memory, Processor processor, Monitor monitor) {
        this.memory = memory;
        this.processor = processor;
        this.monitor = monitor;
        this.type = type;
        this.brand = brand;
    }

    public Computer(Type type, Brand brand) {
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand + " {" + memory + processor + monitor + '}';
    }

    public Type getType() {
        return type;
    }

    public enum Brand {
        Acer,
        DELL,
        HP,
        MSI,
        Lenovo,
    }

    public enum Type {
        Office,
        Home,
        Gaming,

    }
}
