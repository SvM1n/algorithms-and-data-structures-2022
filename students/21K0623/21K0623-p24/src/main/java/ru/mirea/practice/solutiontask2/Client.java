package ru.mirea.practice.solutiontask2;

public class Client {
    private Chair chair;

    public void sit() {
        if (chair.sitOn()) {
            System.out.println("Сидим");
        } else {
            System.out.println("Не сидим");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
