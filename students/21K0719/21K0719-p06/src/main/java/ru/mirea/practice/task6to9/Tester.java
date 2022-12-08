package ru.mirea.practice.task6to9;

public abstract class Tester {
    public static void main(String[] args) {
        Printable[] arr = {new Book("Цветы", "Сталь и кровь"), new Magazine("Playboy")};
        Shop shop = new Shop(arr);

        shop.print();
    }
}
