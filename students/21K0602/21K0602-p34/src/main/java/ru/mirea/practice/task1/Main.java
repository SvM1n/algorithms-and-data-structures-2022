package ru.mirea.practice.task1;




public abstract class Main {
    public static void main(String[] args) {
        UserList<Student> students = new UserList<>();
        students.add(new Student("Vasya", 13293, 32423));
        students.add(new Student("Petya", 1334293, 3223423));
        students.add(new Student("Ivan", 1322493, 3242423));
        for (Student student : students) {
            System.out.println(student.toString());
        }
        Student student01 = new Student("Vasya", 13293, 32423);
        students.remove(student01);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
