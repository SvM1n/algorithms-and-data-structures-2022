package ru.mirea.practice.task5;

import java.util.Date;

public class Reader {
    private String fullname;
    private int ticketNumber;
    private String faculty;
    private Date birthDate;
    private int mobileNumber;

    public void takeBook(int count) {
        System.out.println(fullname + " взял " + count + "книги");
    }

    public void takeBook(Book... books) {
        System.out.println(fullname + " взял книги: ");
        for (Book book : books) {
            System.out.println(book + " ");
        }
    }

    public String getFullname() {
        return fullname;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void returnBook(int count) {
        System.out.println(fullname + " вернул " + count + "книги");
    }

    public void returnBook(Book... books) {
        System.out.println(fullname + " вернул книги: ");
        for (Book book : books) {
            System.out.println(book + " ");
        }
    }
}
