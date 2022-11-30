package ru.mirea.practice.solutiontask5;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Reader[] readers = {new Reader("Крылова Ю.А.", "123", "СПОРТ", "10/10/2003", "+79991231415"),
                            new Reader("Андреев А.А.", "124", "МУЗЫКИ", "10/05/2003", "+79993214151")};

        Book[] books = {new Book("Карл Маркс", "Капитал"), new Book("Тургенеев", "Отцы и дети")};
        readers[0].takeBook(2);
        readers[1].takeBook(3);

        readers[0].takeBook(new String[]{"Капитал", "Отцы и дети"});
        readers[1].takeBook(new String[]{"Отцы и дети", "Капитал"});

        readers[0].takeBook(books);

        readers[0].returnBook(books);
        readers[1].returnBook(1);
    }
}
