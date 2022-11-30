package ru.mirea.practice.s21k0709.task10;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Input {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<Computer>();
    }

    @Override
    public void addComputer(Computer computer) {
        computers.add(new Computer(computer.getMarks()));
    }

    @Override
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }


    @Override
    public void findComputer(Computer computer) {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст");
        } else {
            boolean flag = false;
            for (Computer comp : computers) {
                if (computer.equals(comp)) {
                    System.out.println("Компьютер найден");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Компьютер отсутствует");
            }
        }
    }

    @Override
    public void showCatalog() {
        if (!computers.isEmpty()) {
            for (Computer i: computers) {
                System.out.println(i);
            }
        } else {
            System.out.println("Каталог пуст!");
        }
    }
}
