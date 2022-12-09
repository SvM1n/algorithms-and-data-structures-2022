package ru.mirea.practice.task2;

public class Phone {
    private int number;
    private double weight;
    private String model;

    Phone(int number, double weight, String model) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.model = model;
        this.number = number;

    }

    Phone() {
        this.model = "";
        this.number = 0;
        this.weight = 0;
    }

    @Override
    public String toString() {
        return "Phone " + this.model + " has number " + this.number + " and weights " + this.weight;
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling");
    }

    public void receiveCall(String name, int number) {
        System.out.println(name + " is calling as " + number);
    }

    public void sendMessage(int[] number) {
        for (int j : number) {
            System.out.println("message was sent to " + j);
        }
    }

    public void sendMessage(int number) {
        System.out.println("message was sent to " + number);
    }

    public int getNumber() {
        return number;
    }

}
