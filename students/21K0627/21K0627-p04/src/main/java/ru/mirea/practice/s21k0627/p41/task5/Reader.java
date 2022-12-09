package ru.mirea.practice.s21k0627.p41.task5;

import java.util.List;

public class Reader {
    String fullName;
    int card;
    String faculty;
    String birth;
    String phone;

    Reader(String fullName, int card, String faculty, String birth, String phone) {
        this.fullName = fullName;
        this.card = card;
        this.faculty = faculty;
        this.birth = birth;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public String takeBook() {
        return "";
    }

    public String takeBook(int amountOfBooks) {
        return this.getFullName() + " взял " + amountOfBooks + " книги";
    }

    public String takeBook(List<Book> a) {
        String str = "";
        for (Book i: a) {
            str += i.getNameOfBook() + " ";
        }
        return this.getFullName() + " взял "  + " книги: " + str;
    }

    public String returnBook() {
        return "";
    }

    public String returnBook(int amountOfBooks) {
        return this.getFullName() + " вернул " + amountOfBooks + " книги";
    }

    public String returnBook(List<Book> a) {
        String str = "";
        for (Book i: a) {
            str += i.getNameOfBook() + " ";
        }
        return this.getFullName() + " вернул "  + " книги: " + str;
    }
}