package ru.mirea.practice.program4;

import java.util.Objects;

public class Shop {
    private final Computer[] shop = new Computer[10];

    public Shop() {
        for (int i = 0; i < 10; i++) {
            shop[i] = new Computer("None", 0);
        }
    }

    public void addComputer(String computerType, int capacity) {
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (shop[i].getComputerType() == "None") {
                shop[i].setComputerType(computerType);
                shop[i].setCapacity(capacity);
                break;
            } else {
                counter++;
            }
        }
        if (counter == 9) {
            System.out.println("Overstock!,delete a computer to add a new one.");
            System.out.println("\n");
        }
    }

    public void deleteComputer(int id) {
        shop[id] = new Computer("None", 0);
    }

    public void searchComputer(String computerType) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (Objects.equals(computerType, shop[i].getComputerType())) {
                System.out.println(shop[i]);
                System.out.println("\n");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No such computers");
        }
    }
}
