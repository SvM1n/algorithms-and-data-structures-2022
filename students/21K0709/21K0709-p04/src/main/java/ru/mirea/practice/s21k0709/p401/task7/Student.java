package ru.mirea.practice.s21k0709.p401.task7;

public class Student extends Learner {
    int course;

    Student(int age, String male, String fio, int course) {
        super(age, male, fio);
        this.course = course;
    }

    @Override
    public String toString() {
        return "Age: " + age + "\n" + "Male: " + male + "\n" + "Fio: " + fio + "\n" + "Course: " + course + "\n";
    }
}
