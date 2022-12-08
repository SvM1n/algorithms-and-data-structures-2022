package ru.mirea.practice.task4;

abstract class Tester {
    public static void main(String[] args) {
        Processor processor1 = new Processor(2003, 1200);
        Processor processor2 = new Processor(2020, 4000);
        Processor processor3 = new Processor(2022, 10000);

        Memory memory1 = new Memory(1024);
        Memory memory2 = new Memory(4048);
        Memory memory3 = new Memory(8096);

        Monitor monitor1 = new Monitor("1920x1080", 60);
        Monitor monitor2 = new Monitor("2140x1440", 144);
        Monitor monitor3 = new Monitor("4280x2880", 240);

        Brand brand1 = Brand.Apple;
        Brand brand2 = Brand.LENOVO;
        Brand brand3 = Brand.Msi;

        Computer[] arr = {new Computer(brand1, memory1, monitor1, processor1),
                          new Computer(brand2, memory2, monitor2, processor2),
                          new Computer(brand3, memory3, monitor3, processor3)};

        for (Computer computer : arr) {
            System.out.println(computer);
            System.out.println();
        }
    }
}