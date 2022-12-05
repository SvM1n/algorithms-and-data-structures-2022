package ru.mirea.practice.s21k0647.zad10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop implements Input {
    List<Computer> c = new ArrayList<Computer>();

    public void addComputer(Computer a) {
        c.add(a);
    }


    public void deleteComputer(String model) {
        for (Computer x : c) {
            if (x.model.equals(model)) {
                c.remove(x);
            }
        }
    }

    public Computer searchComputer(String model) {
        Computer computer = new Computer();
        for (Computer x : c) {
            if (x.model.equals(model)) {
                computer = x;
            }
        }
        return computer;
    }

    public void output() {
        for (Computer x : c) {
            System.out.println(x + "\n");
        }
    }


    @Override
    public Computer input(Scanner sc) {
        Computer computer;
        Stamp log = Stamp.valueOf(sc.nextLine());
        String model = sc.next();
        int price = sc.nextInt();
        int memoryreadonly = sc.nextInt();
        int memoryreadrecord = sc.nextInt();
        int speed = sc.nextInt();
        Memory memory = new Memory(memoryreadonly, memoryreadrecord, speed);
        float diagonal = sc.nextFloat();
        int brightness = sc.nextInt();
        int frequency = sc.nextInt();
        Monitor monitor = new Monitor(diagonal, brightness, frequency);
        int numberOfCores = sc.nextInt();
        int taktFrequency = sc.nextInt();
        int heatDissipation = sc.nextInt();
        Processor processor = new Processor(numberOfCores, taktFrequency, heatDissipation);
        computer = new Computer(log, model, price, memory, monitor, processor);
        return computer;
    }


}
