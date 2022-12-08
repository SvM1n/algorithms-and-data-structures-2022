package ru.mirea.practice.s21k0709.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    String name;
    String surname;
    String speciality;
    int course;
    String group;

    private final Calendar birthDay;


    public Student(String name, String surname, String speciality, int course, String group, Calendar birthDay) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.birthDay = birthDay;
    }

    public Calendar getBirthDay() {
        return birthDay;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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

    public String getFormatDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.format(birthDay);
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "name='" + name + '\''
                +
                ", surname='" + surname + '\''
                +
                ", speciality='" + speciality + '\''
                +
                ", course=" + course
                +
                ", group='" + group + '\''
                +
                ", birthDay=" + getFormatDate()
                +
                '}';
    }
}
