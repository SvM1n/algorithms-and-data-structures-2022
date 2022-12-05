package ru.mirea.practice.task2;

import ru.mirea.practice.task3.Address;

public class Person {
    private String name;
    private final String surname;
    private String patronymic;

    private Address address;

    public Person(String name, String surname, String patronymic, Address address) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address.getAddress();
    }

    public String getFio() {
        if (name.length() == 0) {
            name = "None";
        }

        if (patronymic.length() == 0) {
            patronymic = "None";
        }

        return new StringBuilder().append(surname).append(" ")
                .append(name.charAt(0)).append(". ").append(patronymic.charAt(0)).append(". ").toString();
    }
}
