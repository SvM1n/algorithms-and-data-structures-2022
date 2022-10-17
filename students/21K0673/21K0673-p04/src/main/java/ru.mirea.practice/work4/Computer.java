package ru.mirea.practice.work4;

public class Computer {
    protected EnumComputer companyName;
    protected double cost;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    Computer() {
    }

    public Computer(EnumComputer companyName, double cost, Processor processor, Memory memory, Monitor monitor) {
        this.companyName = companyName;
        this.cost = cost;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer{Company name:" + companyName + ", Cost=" + cost + '}';
    }

    public static void main(String[] args) {
        Computer a = new Computer(EnumComputer.Apple, 8000, new Processor(EnumComputer.Apple, 2000, 5,
                7, 96), new Memory(EnumComputer.Samsung, 256, 13),
                new Monitor(EnumComputer.Apple, 19653, 20, 168));

    }
}