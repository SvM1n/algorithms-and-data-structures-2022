package ru.mirea.practice.n2;

public class Client {
    private Chair ch;

    public void sit() {

        System.out.println("Sits");
    }

    public Chair getChair() {

        return ch;
    }

    public void setChair(Chair chair) {

        System.out.println("Sets");
    }
}
