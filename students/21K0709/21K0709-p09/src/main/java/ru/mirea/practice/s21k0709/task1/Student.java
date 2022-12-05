package ru.mirea.practice.s21k0709.task1;

public class Student {
    String name;
    String faculty;
    int age;
    String gender;

    double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, String faculty, int age, String gender) {
        this.name = name;
        this.faculty = faculty;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "name='" + name + '\''
                +
                ", faculty='" + faculty + '\''
                +
                ", age=" + age
                +
                ", gender='" + gender + '\''
                +
                '}';
    }
}