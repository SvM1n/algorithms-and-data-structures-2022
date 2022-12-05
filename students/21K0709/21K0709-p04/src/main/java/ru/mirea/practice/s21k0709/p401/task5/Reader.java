package ru.mirea.practice.s21k0709.p401.task5;

import java.util.List;

public class Reader {
    String fio;
    int libraryCard;
    int faculty;
    int dateOfBirth;
    String phoneNumber;

    Reader(String fio, int libraryCard, int faculty, int dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public String getFio() {
        return fio;
    }

    public String takeBook() {
        return "";
    }

    public String takeBook(int colBook) {
        return this.getFio() + " взял " + colBook + " книги";
    }

    public String takeBook(List<Book> a) {
        String str = "";
        for (Book i: a) {
            str += i.getNameBook() + " ";
        }
        return this.getFio() + " взял "  + " книги: " + str;
    }

    public String returnBook() {
        return "";
    }

    public String returnBook(int colBook) {
        return this.getFio() + " вернул " + colBook + " книги";
    }

    public String returnBook(List<Book> a) {
        String str = "";
        for (Book i: a) {
            str += i.getNameBook() + " ";
        }
        return this.getFio() + " вернул "  + " книги: " + str;
    }
}
