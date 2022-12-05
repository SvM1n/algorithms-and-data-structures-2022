package ru.mirea.practice2.task7;

abstract class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book(1951, "Над пропастью во ржи");
        System.out.println(book1);
        book1.setBookname("Unnamed book");
        book1.setReleaseyear(1234);
        System.out.println(book1.getBookname());
        System.out.println(book1.getReleaseyear());
        System.out.println(book1);
        BookShell shell = new BookShell();
        shell.addBook();
        System.out.println(shell.findEarliestBook());
        System.out.println(shell.findLatestBook());
        System.out.println(shell.getAmountOfBooks());
        shell.sortShell();

    }
}