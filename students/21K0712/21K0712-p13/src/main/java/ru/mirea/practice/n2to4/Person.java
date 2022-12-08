package ru.mirea.practice.n2to4;

public class Person {
    private String name;
    private String surname;
    private String patronymic;

    Person(String surname) {
        this.surname = surname;
    }

    Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        if (name != null & patronymic != null) {
            return surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".";
        } else {
            return surname;
        }
    }

}
