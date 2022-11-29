package ru.mirea.practice.task4;

public abstract class Test {
    public static void main(String[] args) {
        Processor processor1 = new Processor(3.5, 6, 3);
        Processor processor2 = new Processor(3.5, 6, 3);
        Processor processor3 = new Processor(3.5, 6, 3);

        Memory memory1 = new Memory(4, 1024);
        Memory memory2 = new Memory(8, 1024);
        Memory memory3 = new Memory(16, 1024);

        Monitor monitor1 = new Monitor(60, "1920x1080");
        Monitor monitor2 = new Monitor(60, "1280x720");
        Monitor monitor3 = new Monitor(75, "1920x1080");

        Brand lenovo = Brand.LENOVO;
        Brand hp = Brand.HP;
        Brand dexp = Brand.DEXP;

        Computer[] arr = {new Computer(processor1, memory1, monitor1, lenovo),
            new Computer(processor2, memory2, monitor2, hp),
            new Computer(processor3, memory3, monitor3, dexp)};

        for (Computer computer : arr) {
            System.out.println(computer);
            System.out.println();
        }
    }
}
