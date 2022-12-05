package ru.mirea.practice.task6to9;

public abstract class Tester {
    public static void main(String[] args) {
        Printable[] arr = {new Book("Преступление и наказание", "Достоевский"), new Magazine("Maxim")};
        Shop shop = new Shop(arr);

        shop.print();
    }
}
