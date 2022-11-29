package ru.mirea.practice.n1;

import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private String group;

    private Date birthdate;

    private int mark;

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String name, String surname, String specialization, int course, String group, int mark) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "name='" + name + '\''
                +
                ", surname='" + surname + '\''
                +
                ", specialization='" + specialization + '\''
                +
                ", course=" + course
                +
                ", group='" + group + '\''
                +
                ", mark=" + mark
                +
                ", birthdate=" + birthdate.toString()
                +
                '}';
    }
}
