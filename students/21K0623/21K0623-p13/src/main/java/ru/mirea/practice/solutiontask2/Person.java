package ru.mirea.practice.solutiontask2;

public class Person {
    private final String firstName;
    private final String patronymic;
    private final String lastName;

    public Person(String firstName, String patronymic, String lastName) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
    }

    public String getFirstName() {
        if (!firstName.isEmpty()) {
            return firstName;
        }
        return " ";
    }

    public String getPatronymic() {
        if (!firstName.isEmpty()) {
            return patronymic;
        }
        return " ";
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + " " + getPatronymic();
    }
}
