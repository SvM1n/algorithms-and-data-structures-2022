package ru.mirea.practice.task7and8;

public abstract class Tester {
    public static void main(String[] args) {
        Printable[] printables = {new Magazine("ПлейБой"),
            new Book("Преступление и наказание"),
            new Book("Война и мир"),
            new Magazine("Домохозяйкам")};

        Book.printBooks(printables);
        System.out.println("--------------------------------------------");
        Magazine.printMagazines(printables);
    }
}
