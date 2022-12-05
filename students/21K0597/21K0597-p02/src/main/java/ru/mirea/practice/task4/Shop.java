package ru.mirea.practice.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Computer> computers;

    public Shop() {
        this.computers = new ArrayList<Computer>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public String search(String videoCard, String motherBoard, String memory, String cpu) {
        for (Computer comp: computers) {
            if (videoCard.equals(comp.getVideoCard()) && motherBoard.equals(comp.getMotherBoard())
                    && memory.equals(comp.getMemory()) && cpu.equals(comp.getCpu())) {
                return "There is such a computer in the shop\n";
            }
        }
        return "There is no such computer in the store \n";
    }

    public void deleteComputer(int computerNumber) {
        computers.remove(computerNumber);
    }
}
