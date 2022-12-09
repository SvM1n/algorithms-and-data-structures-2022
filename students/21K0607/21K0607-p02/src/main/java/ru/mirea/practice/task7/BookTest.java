package ru.mirea.practice.task7;

public abstract class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("Mark Tween", "Tom Sawyer", 1876));
        bookShelf.addBook(new Book("Agatha Christie", "The Thirteen Problems", 1932));
        bookShelf.addBook(new Book("Johann Wolfgang von Goethe", "Faust", 1806));
        bookShelf.sortBooks();
        System.out.println(bookShelf.getMaxData());
        System.out.println(bookShelf.getMinData());
    }
}
