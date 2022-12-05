package ru.mirea.practice.task2;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public String getFullName() {
        return surname + " "
            + (!name.isEmpty() ? name : "") + " "
            + (!patronymic.isEmpty() ? patronymic : "");
    }
}
