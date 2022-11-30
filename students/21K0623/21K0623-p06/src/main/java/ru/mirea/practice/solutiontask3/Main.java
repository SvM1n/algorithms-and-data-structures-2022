package ru.mirea.practice.solutiontask3;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Planet first = new Planet("Земля");
        Animal second = new Animal("Гепард");
        System.out.println(first.getName());
        System.out.println(second.getName());
    }
}
