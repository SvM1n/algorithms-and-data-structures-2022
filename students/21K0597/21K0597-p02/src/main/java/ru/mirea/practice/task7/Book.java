package ru.mirea.practice.task7;

public class Book {
    private String author;
    private String booksName;
    private int writingYear;

    public Book(String author, String booksName, int writingYear) {
        this.author = author;
        this.booksName = booksName;
        this.writingYear = writingYear;
    }

    public Book() {
        this.author = "author";
        this.booksName = "booksname";
        this.writingYear = 0;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookname() {
        return booksName;
    }

    public void setBookname(String bookName) {
        this.booksName = bookName;
    }

    public int getWritingYear() {
        return writingYear;
    }

    public void setWritingYear(int writingYear) {
        this.writingYear = writingYear;
    }

    @Override
    public String toString() {
        return "Book{" + "author='" + author + '\'' + ", booksName='" + booksName + '\'' + ", writingYear=" + writingYear + '}';
    }
}
