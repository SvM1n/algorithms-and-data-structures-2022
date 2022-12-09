package ru.mirea.practice.program6to9;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Book book1 = new Book("Cinderella", "Charles Perrault");
        Shop shop1 = new Shop("Adria", "contact lenses");
        Printable[] array = {book1, shop1};
        for (Printable print : array) {
            print.print();
        }
    }
}
