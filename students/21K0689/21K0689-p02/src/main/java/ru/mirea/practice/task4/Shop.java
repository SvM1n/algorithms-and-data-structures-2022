package ru.mirea.practice.task4;

import java.util.List;


public class Shop {
    private List<Computer> assortment;
    public static int numOfComputers;


    public void addComp(String type, String model, double price) {
        assortment.add(new Computer(type, model, price));
        numOfComputers++;
    }

    public void deleteComp(String type, String model, double price) {
        for (int i = 0; i < assortment.size(); i++) {
            if (assortment.get(i).getType().equals(type) && assortment.get(i).getModel().equals(model) && assortment.get(i).equals(price)) {
                assortment.remove(i);
            }
        }
        numOfComputers--;
    }

    public String searchComp(String type, String model, double price) {
        for (int i = 0; i < numOfComputers; i++) {
            if (assortment.get(i).getType().equals(type) && assortment.get(i).getModel().equals(model)) {
                System.out.println("Shop has that computer");
                return "yes";

            }
        }
        System.out.println("Shop has not that computer");
        return "NO";
    }

    public void print() {
        for (Computer computer : assortment) {
            System.out.println(computer.toString());
        }
        System.out.println("Number of computers is " + numOfComputers);
    }

    public void setAssortment(List<Computer> assortment) {
        this.assortment = assortment;
    }
}
