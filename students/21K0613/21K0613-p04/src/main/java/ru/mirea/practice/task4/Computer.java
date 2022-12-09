package ru.mirea.practice.task4;

public class Computer {
    Memory memory;
    Monitor monitor;
    Processor processor;

    Brand brand;

    public Computer(Memory mem, Monitor mon, Processor proc, Brand brn) {
        memory = mem;
        monitor = mon;
        processor = proc;
        brand = brn;
    }
}
