package ru.mirea.practice.task10;

public class Computer {
    private Monitor monitor;
    private Memory memory;
    private Processor processor;

    private Brand brand;

    public Computer(Monitor monitor, Memory memory, Processor processor, Brand brand) {
        this.monitor = monitor;
        this.memory = memory;
        this.processor = processor;
        this.brand = brand;
    }

    public Computer() {
        this.monitor = new Monitor("",0);
        this.memory = new Memory(0);
        this.processor = new Processor(0);
        this.brand = Brand.o;
    }

    public Computer(Brand brand) {
        this.brand = brand;
        switch (brand) {
            case HP:
                memory = new Memory(512);
                processor = new Processor(2.6);
                monitor = new Monitor("1920x1080", 144);
                break;
            case ASUS:
                memory = new Memory(2048);
                processor = new Processor(5);
                monitor = new Monitor("1920x1080", 240);
                break;
            case LENOVO:
                memory = new Memory(1024);
                processor = new Processor(3.2);
                monitor = new Monitor("1920x1080", 60);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand + ":\n" + monitor + "\n" + processor + "\n" + memory + "\n\n";
    }
}
