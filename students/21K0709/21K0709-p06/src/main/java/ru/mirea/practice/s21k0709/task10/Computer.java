package ru.mirea.practice.s21k0709.task10;

import java.util.Objects;

public class Computer {
    int price;
    Memory memory;
    Monitor monitor;
    Processor processor;
    Marks marks;

    public enum Marks {
        Acer,
        MSI,
        Xiaomi,
    }

    Computer(int price, Monitor monitor, Memory memory, Processor processor, Marks marks) {
        this.price = price;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
        this.marks = marks;
    }

    public Computer(Marks marks) {
        this.marks = marks;
        switch (marks) {
            case Acer:
                monitor = new Monitor("1920x1080", 144);
                processor = new Processor(4, 2.2);
                memory = new Memory(1024, "HDD");
                break;
            case MSI:
                monitor = new Monitor("1920x1080", 60);
                processor = new Processor(8, 5);
                memory = new Memory(1024, "SSD");
                break;
            case Xiaomi:
                monitor = new Monitor("1920x1080", 72);
                processor = new Processor(8, 4);
                memory = new Memory(512, "SSD");
                break;
            default:
                break;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Computer{"
                +
                "price=" + price
                +
                ", memory=" + memory
                +
                ", monitor=" + monitor
                +
                ", processor=" + processor
                +
                ", marks=" + marks
                +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Computer computer = (Computer) obj;
        return marks == computer.marks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }
}