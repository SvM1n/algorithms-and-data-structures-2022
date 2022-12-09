package ru.mirea.practice.task1;

import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    private String group;
    private int course;
    private String specialization;
    private double gpa;

    public Student(String name, String group, int course, String specialization, double gpa) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.specialization = specialization;
        this.gpa = gpa;
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

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{"
                + "name='" + name + '\''
                + ", group='" + group + '\''
                + ", level=" + course
                + ", specialization='" + specialization + '\''
                + ", gpa=" + gpa
                + '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getGpa() == o2.getGpa()) {
            return 0;
        }
        if (o1.getGpa() > o2.getGpa()) {
            return 1;
        }
        return -1;
    }
}
