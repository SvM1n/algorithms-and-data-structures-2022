package ru.mirea.practice.solutiontask69;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Printable[] first = new Printable[] {new Book("Отцы и дети", "Тургенев"),
                                             new Shop("Хабр", 58)};
        for (Printable printable: first) {
            printable.print();
        }
    }
}
