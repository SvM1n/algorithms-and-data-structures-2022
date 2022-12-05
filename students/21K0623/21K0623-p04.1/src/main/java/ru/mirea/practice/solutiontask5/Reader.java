package ru.mirea.practice.solutiontask5;

public class Reader {
    private final String name;
    private final String number;
    private final String facultet;
    private final String dateofbirth;
    private final String numberphone;

    public Reader(String name, String number, String facultet, String dateofbirth, String numberphone) {
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.facultet = facultet;
        this.number = number;
        this.numberphone = numberphone;
    }

    public void takeBook(int count) {
        System.out.println(name + " взял " + count + " книги");
    }

    public void takeBook(Book[] books) {
        System.out.print(name + "взял книги: ");
        for (Book book:books) {
            System.out.print(book.getNamebook() + " ");
        }
        System.out.println("");
    }

    public void takeBook(String[] books) {
        System.out.print(name + "взял книги: ");
        for (String book:books) {
            System.out.print(book + ", ");
        }
        System.out.println("");
    }

    public void returnBook(int count) {
        System.out.println(name + " вернул " + count + " книги");
    }

    public void returnBook(Book[] books) {
        System.out.print(name + "вернул книги: ");
        for (Book book:books) {
            System.out.print(book.getNamebook() + ", ");
        }
        System.out.println("");
    }

    public void returnBook(String[] books) {
        System.out.print(name + "вернул книги: ");
        for (String book:books) {
            System.out.print(book + ", ");
        }
        System.out.println("");
    }

    public String getNumber() {
        return number;
    }

    public String getFacultet() {
        return facultet;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getNumberphone() {
        return numberphone;
    }
}
