package ru.mirea.practice.program7to8;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Printable[] printables = {new Magazine("Vogue"), new Magazine("Time"), new Book("Alice in Wonderland"), new Book("Forrest Gump")};
        Book.printBooks(printables);
        System.out.println('\n');
        Magazine.printMagazines(printables);
    }
}
