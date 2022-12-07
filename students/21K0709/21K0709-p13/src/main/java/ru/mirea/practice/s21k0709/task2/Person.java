package ru.mirea.practice.s21k0709.task2;

public class Person {
    private final String surname;
    private String name;
    private String patronymic;


    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }


    @Override
    public String toString() {
        return "Person{"
                +
                "surname='" + surname + '\''
                +
                ", name='" + name + '\''
                +
                ", patronymic='" + patronymic + '\''
                +
                '}';
    }

    public String getFio() {
        if (name.length() == 0) {
            name = "ФИО отсутствует";
        }

        if (patronymic.length() == 0) {
            patronymic = "Отчество отсутствует";
        }

        return new StringBuilder().append(surname).append(" ").append(name.charAt(0)).append(".").append(patronymic.charAt(0)).append(".").toString();


    }
}