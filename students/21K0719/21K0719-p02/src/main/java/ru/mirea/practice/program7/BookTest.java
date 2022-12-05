package ru.mirea.practice.program7;

abstract class BookTest {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf();
        bookshelf.init();
        System.out.println(bookshelf.findTheEarlier());
        System.out.println(bookshelf.findTheLatest());
        System.out.println("Before sorting");
        bookshelf.print();
        System.out.println("After sorting");
        bookshelf.sort();
        bookshelf.print();
    }
}
