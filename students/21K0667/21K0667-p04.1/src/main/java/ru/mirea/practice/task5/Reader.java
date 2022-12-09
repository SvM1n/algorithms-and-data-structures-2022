package ru.mirea.practice.task5;

public class Reader {
    private String name;
    private int id;

    public Reader(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void takeBook(int number) {
        System.out.print(name + " взял " + number + " книги");
    }

    public void takeBook(Book... books) {
        System.out.print(name + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + ", ");
        }
    }

    public void takeBook(String... books) {
        System.out.print(name + " взял книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
    }


    public void returnBook(int number) {
        System.out.print(name + " вернул " + number + " книги");
    }

    public void returnBook(Book... books) {
        System.out.print(name + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getName() + ", ");
        }
    }

    public void returnBook(String... books) {
        System.out.print(name + " вернул книги: ");
        for (String book : books) {
            System.out.print(book + ", ");
        }
    }

}
