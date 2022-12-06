package ru.mirea.practice.task4;

import ru.mirea.practice.task4.memory.Memory;
import ru.mirea.practice.task4.memory.Type;

public abstract class Store {
    public static void main(String[] args) {
        Memory ssd512 = new Memory(512, Type.SSD);
        Memory ssd1024 = new Memory(1024, Type.SSD_M2);
        Memory hdd2046 = new Memory(2046, Type.HDD);

        Monitor fullHD144 = new Monitor("1920x1080", 90);
        Monitor twoK144 = new Monitor("2048x1080", 144);
        Monitor fullHD60 = new Monitor("2048x1080", 60);

        Processor intell9I5 = new Processor(9, "9300H", 2400);
        Processor intell11I9 = new Processor(11, "11900H", 4900);
        Processor intell12I7 = new Processor(12, "1255UL", 4700);


        Computer[] computers = {
            new Computer(Computer.Type.Home, Computer.Brand.Acer, hdd2046, intell9I5, fullHD144),
            new Computer(Computer.Type.Gaming, Computer.Brand.MSI, ssd512, intell11I9, fullHD60),
            new Computer(Computer.Type.Office, Computer.Brand.DELL, ssd512, intell9I5, fullHD60),
            new Computer(Computer.Type.Gaming, Computer.Brand.Lenovo, ssd1024, intell12I7, twoK144)
        };

        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
