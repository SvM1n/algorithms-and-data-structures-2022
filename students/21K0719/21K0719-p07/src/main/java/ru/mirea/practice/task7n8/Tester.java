package ru.mirea.practice.task7n8;

public abstract class Tester {
    public static void main(String[] args) {
        Printable[] printables = {new Magazine("MAXIM"),
            new Book("Человек амфибия"),
            new Book("Красота и уродство"),
            new Magazine("American idiot")};

        Magazine.printMagazines(printables);
        System.out.println();
        Book.printBooks(printables);
    }
}
