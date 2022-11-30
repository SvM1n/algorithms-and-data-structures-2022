package ru.mirea.practice.solutiontask7;

public class Schoolman extends Classman {
    private final int rank;

    public Schoolman(int rank, String nameinstitution) {
        super(nameinstitution);
        this.rank = rank;
    }

    @Override
    public void getInfo() {
        System.out.println("Школьник обучается в " + nameinstitution + " в " + rank + " классе");
    }
}
