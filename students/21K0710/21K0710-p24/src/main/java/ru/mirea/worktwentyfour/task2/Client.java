package ru.mirea.worktwentyfour.task2;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Sitting on " + chair.toString());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
