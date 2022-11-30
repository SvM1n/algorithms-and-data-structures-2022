package ru.mirea.practice.solutiontask7;

public class Classman {
    protected String nameinstitution;

    public Classman(String nameinstitution) {
        this.nameinstitution = nameinstitution;
    }

    public void getInfo() {
        System.out.println("Обучается в " + nameinstitution);
    }
}
