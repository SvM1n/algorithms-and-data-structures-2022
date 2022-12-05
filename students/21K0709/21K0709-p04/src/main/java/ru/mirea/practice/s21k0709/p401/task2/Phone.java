package ru.mirea.practice.s21k0709.p401.task2;

import java.util.List;

public class Phone {
    int number;
    int model;
    double weight;

    Phone(int number, int model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, int model) {
        this.number = number;
        this.model = model;
    }

    Phone() {
        //
    }

    public String receiveCall(String nameCall) {
        return "Звонит " + nameCall;
    }

    public String receiveCall(String nameCall, String numberCall) {
        return "Имя звонящего: " + nameCall + "\n" + "Номер телефона: " + numberCall;
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage(List<String> str) {
        for (String i: str) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "Number: " + number + "\n" + "Model: " + model + "\n" + "Weight: " + weight;
    }
}
