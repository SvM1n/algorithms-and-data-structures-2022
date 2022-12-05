package ru.mirea.practice.s21k0709.p401.task7;

public class Schoolboy extends Learner {
    int classSchool;

    Schoolboy(int age, String male, String fio, int classSchool) {
        super(age, male, fio);
        this.classSchool = classSchool;
    }

    @Override
    public String toString() {
        return "Age: " + age + "\n" + "Male: " + male + "\n" + "Fio: " + fio + "\n" + "ClassSchool: " + classSchool + "\n";
    }
}
