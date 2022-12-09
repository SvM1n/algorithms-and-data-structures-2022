package ru.mirea.practice.s21k0647.punkt78;

public final class Tester {
    private Tester() {
        //pust
    }

    public static void main(String[] args) {
        Printable[] p = new Printable[2];
        p[0] = new Magazine("Здровье", "22.10.2022");
        p[1] = new Book("Доктор Живаго", "Б.Л.Пастернак");
        Magazine m1 = new Magazine();
        Book b1 = new Book();
        m1.printMagazine(p);
        b1.printBook(p);
    }


}
