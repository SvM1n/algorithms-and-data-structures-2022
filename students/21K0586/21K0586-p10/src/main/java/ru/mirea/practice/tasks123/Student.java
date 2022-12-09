package ru.mirea.practice.tasks123;

public class Student {
    private String name;
    private String surname;
    private String group;
    private String speciality;
    private int course;
    private double grade;

    Student(String name, String surname, String group, int course, String speciality, double grade) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.course = course;
        this.speciality = speciality;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", group='" + group + '\'' + '}';
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean grade(Student student) {
        return student.grade < this.grade;
    }

    public boolean course(Student student) {
        return student.course < this.course;
    }

    public String getSpeciality() {
        return speciality;
    }
}
