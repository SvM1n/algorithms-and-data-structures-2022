package ru.mirea.workeleven.task3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Student {
    LocalDate birthDate;
    private String name;
    private String group;
    private double averageMark;

    public Student(String name, String group, LocalDate birthDate, double averageMark) {
        this.name = name;
        this.group = group;
        this.birthDate = birthDate;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String convertDate(FormatStyle style) {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(style);
        return this.birthDate.format(formatter);
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", group='" + group + '\'' + ", birthDate=" + convertDate(FormatStyle.SHORT) + ", averageMark="
                + averageMark + '}';
    }
}
