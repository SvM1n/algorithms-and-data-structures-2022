package ru.mirea.practice.s21k0709.task3;

public class Student {
    String name;
    String faculty;
    int mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String facultate) {
        this.faculty = facultate;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }



    public Student(String name, String faculty, int mark) {
        this.name = name;
        this.faculty = faculty;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "name='" + name + '\''
                +
                ", faculty='" + faculty + '\''
                +
                ", mark=" + mark
                +
                '}';
    }
}