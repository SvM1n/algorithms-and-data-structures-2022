package ru.mirea.practice.task4;

abstract class Main {
    public static void main(String[] args) {
        Processor processor1 = new Processor(14, 6700);
        Processor processor2 = new Processor(10, 4000);

        Memory memory1 = new Memory(8, 512, 1024);
        Memory memory2 = new Memory(16, 1024, 0);

        Monitor monitor1 = new Monitor(22, 60);
        Monitor monitor2 = new Monitor(24, 120);

        Brand brand1 = Brand.LENOVO;
        Brand brand2 = Brand.HP;
        Brand brand3 = Brand.SAMSUNG;
        Computer computer1 = new Computer(processor1, memory1, monitor1, brand1);
        Computer computer2 = new Computer(processor2, memory2, monitor2, brand2);
        Computer computer3 = new Computer(processor2, memory2, monitor1, brand3);
        Computer[] computers = {computer1, computer2, computer3};
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
