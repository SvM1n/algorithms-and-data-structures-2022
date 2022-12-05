package ru.mirea.workten;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private int year;
    private String group;
    private double averageMark;

    public Student(String name, String surname, String speciality, int year, String group, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.year = year;
        this.group = group;
        this.averageMark = averageMark;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", speciality='" + speciality + '\'' + ", year=" + year
                + ", group='" + group + '\'' + ", averageMark=" + averageMark + '}';
    }
}
