package ru.mirea.practice.solutiontask1;

public class Student implements Comparable<Student> {
    private final String name;
    private final int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name + "\n" + id;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.id;
    }
}
