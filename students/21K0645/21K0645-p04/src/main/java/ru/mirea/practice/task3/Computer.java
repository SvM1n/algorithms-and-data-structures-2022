package ru.mirea.practice.task3;

enum Brand {
    Apple, Huawei, Asus, DELL
}

public class Computer {

    private Brand brand;
    private String name;
    private int price;

    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, String name, int price, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{"
                + "brand=" + brand
                + ",  name='" + name + '\''
                + ",  price=" + price
                + ",  processor=" + processor
                + ",  memory=" + memory
                + ",  monitor=" + monitor
                + '}';
    }
}

class Processor{
    private final double frequency;
    private final int numberOfCores;

    public Processor(double frequency, int numberOfCores) {
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    @Override
    public String toString() {
        return "Processor{"
                + "frequency=" + frequency
                + ",  numberOfCores=" + numberOfCores
                + '}';
    }
}

class Memory{
    private final int storage;

    public Memory(int storage) {
        this.storage = storage;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public String toString() {
        return "Memory{"
                + "storage=" + storage
                + '}';
    }
}

class Monitor{
    private final double screenArea;

    public Monitor(double screenArea) {
        this.screenArea = screenArea;
    }

    public double getScreenArea() {
        return screenArea;
    }

    @Override
    public String toString() {
        return "Monitor{"
                + "screenArea=" + screenArea
                + '}';
    }
}