package ru.mirea.practice.task1;

/* 1. По диаграмме класса UML описывающей сущность Автор.
 Необходимо написать программу, которая состоит из двух классов Author и
 TestAuthor. Класс Author должен содержать реализацию методов,
 представленных на диаграмме класса.*/

public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Author{"
                + "name='" + name + '\''
                + ",  email='" + email + '\''
                + ",  gender=" + gender
                + '}';
    }
}
