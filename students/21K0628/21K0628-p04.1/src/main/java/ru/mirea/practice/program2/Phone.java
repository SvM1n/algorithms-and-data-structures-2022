package ru.mirea.practice.program2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        this.number = "";
        this.model = "";
        this.weight = 0;
    }

    public void receiveCall(String name) {
        System.out.println("Calling {" + name + '}');
    }

    public void receiveCall(String name, String number) {
        System.out.println("calling " + name + ' ' + number);
    }

    public void sendMessage(String[] numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{"
                + "number='" + number + '\''
                + ", model='" + model + '\''
                + ", weight=" + weight + '}';
    }
}
