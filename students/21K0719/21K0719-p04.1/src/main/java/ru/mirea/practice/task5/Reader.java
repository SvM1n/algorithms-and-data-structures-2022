package ru.mirea.practice.task5;

public class Reader {
    private String fullName;

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    public void takeBook(int quantity) {
        System.out.print(fullName + " взял " + quantity + " книги");
    }

    public void takeBook(String... books) {
        System.out.print(fullName + " взял книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + ", ");
        }
    }

    public void returnBook(int quantity) {
        System.out.print(fullName + " вернул " + quantity + " книги");
    }

    public void returnBook(String... books) {
        System.out.print(fullName + " вернул книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + ", ");
        }
    }
}