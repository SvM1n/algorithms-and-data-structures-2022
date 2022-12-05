package ru.mirea.practice2.task7;

public class Book {
    private Integer releaseyear;
    private String bookname;

    public Book(Integer releaseyear, String bookname) {
        this.releaseyear = releaseyear;
        this.bookname = bookname;
    }

    public Integer getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(Integer releaseyear) {
        this.releaseyear = releaseyear;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Override
    public String toString() {
        return "Book{" + "release_year=" + releaseyear + ", book_name='" + bookname + '\'' + '}';
    }
}
