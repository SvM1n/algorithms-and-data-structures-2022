package ru.mirea.worktwentyfour.task2;

public class Client {
    private Chair chair;

    public void sit() {
        System.out.println("Sit down");
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        System.out.println("Sets");
    }
}
