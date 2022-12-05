package ru.mirea.practice.task7;


public abstract class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Хехе", "Хаха", 1984);
        Book book2 = new Book("Хохо", "Хихи", 1765);
        Book book3 = new Book("Хыхы", "Хаха", 2021);
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);
        bookshelf.old();
        bookshelf.young();
        bookshelf.sort();
        bookshelf.print();


    }
}

