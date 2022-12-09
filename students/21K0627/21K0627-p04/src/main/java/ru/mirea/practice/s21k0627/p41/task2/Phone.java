package ru.mirea.practice.s21k0627.p41.task2;

import java.util.List;

public class Phone {
    int number;
    int model;
    int weight;

    Phone(int number, int model, int weight) {
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

    public String receiveCall(String name) {
        return "Звонит " + name;
    }

    public String receiveCall(String name, String number) {
        return "Имя звонящего: " + name + ", Номер телефона: " + number;
    }

    public int getNumber() {
        return number;
    }

    public void sendMessage(List<String> str) {
        for (String i : str) {
            System.out.println(i);
        }
    }

    @Override
    public String toString() {
        return "Number: " + number + "; Model: " + model + "; Weight: " + weight;
    }
}