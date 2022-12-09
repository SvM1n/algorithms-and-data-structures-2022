package ru.mirea.practice.task3;

/* Создать класс, описывающий сущность компьютер (Computer). Для
описания составных частей компьютера использовать отдельные классы
(Processor, Memory, Monitor). Описать необходимые свойства и методы для
каждого класса. Для названий марок компьютера используйте перечисления
(enum) */

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

