package ru.mirea.practice.task4;

abstract class Tester {
    public static void main(String[] args) {
        Processor processor1 = new Processor(9, 2400);
        Processor processor2 = new Processor(11, 4300);
        Processor processor3 = new Processor(12, 4400);

        Memory memory1 = new Memory(512);
        Memory memory2 = new Memory(1024);
        Memory memory3 = new Memory(2048);

        Monitor monitor1 = new Monitor("1920x1080", 60);
        Monitor monitor2 = new Monitor("1920x1080", 144);
        Monitor monitor3 = new Monitor("1920x1080", 240);

        Brand brand1 = Brand.HP;
        Brand brand2 = Brand.LENOVO;
        Brand brand3 = Brand.ASUS;

        Computer[] arr = {new Computer(brand1, memory1, monitor1, processor1),
            new Computer(brand2, memory2, monitor2, processor2),
            new Computer(brand3, memory3, monitor3, processor3)};

        for (Computer computer : arr) {
            System.out.println(computer);
            System.out.println();
        }
    }
}
