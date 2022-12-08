package ru.mirea.practice.s21k0647.punkt78;

public class Book extends Printable {
    String author;

    Book() {
        //pust
    }

    Book(String name, String author) {
        super(name);
        this.author = author;
    }


    public void printBook(Printable [] printables) {
        System.out.println("Книги: ");
        for (Printable x: printables) {
            if (x instanceof Book) {
                print(x);
            }
        }
    }

    @Override
    public void print(Printable b) {
        System.out.println("Название " + b.name + "\tАвтор " + ((Book) b).author);
    }
}
