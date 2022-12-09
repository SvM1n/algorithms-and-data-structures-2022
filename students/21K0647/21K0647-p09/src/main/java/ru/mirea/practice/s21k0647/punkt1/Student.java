package ru.mirea.practice.s21k0647.punkt1;

public class Student {
    int idnumber;
    String name;

    int gba;

    Student(int idnumber, String name) {
        this.idnumber = idnumber;
        this.name = name;
    }

    public Student(int idnumber, String name, int gba) {
        this.idnumber = idnumber;
        this.name = name;
        this.gba = gba;
    }

    public int getGba() {
        return gba;
    }

    public String toString() {
        return "ФИО\t" + name + "\tID: " + idnumber + "\tGBA: " + gba;
    }


}
