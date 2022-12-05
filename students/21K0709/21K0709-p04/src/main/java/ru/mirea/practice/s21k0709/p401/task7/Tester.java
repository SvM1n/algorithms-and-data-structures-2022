package ru.mirea.practice.s21k0709.p401.task7;

public abstract class Tester {
    public static void main(String[] args) {
        Learner[] mas = new Learner[4];
        mas[0] = new Schoolboy(11,"М","Иванов И.В",4);
        mas[1] = new Student(18,"Ж", "Петрова К.Т", 1);
        mas[2] = new Schoolboy(12,"Ж","Иванова А.М",5);
        mas[3] = new Student(19,"М", "Тимофеев К.Т", 2);
        for (Learner i: mas) {
            System.out.println(i);
        }
    }
}
