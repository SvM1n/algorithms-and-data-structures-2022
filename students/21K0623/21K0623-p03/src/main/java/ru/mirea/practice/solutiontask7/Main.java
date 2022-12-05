package ru.mirea.practice.solutiontask7;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Convector test = new Convector("Ru", "ru", "US", "en", 0.016);
        System.out.println(test.convectorMoneyInfo(1000));
    }
}
