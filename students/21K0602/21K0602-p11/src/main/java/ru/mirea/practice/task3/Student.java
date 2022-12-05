package ru.mirea.practice.task3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {

    private final String name;
    private String group;
    private int course;
    private final Calendar birthDate;


    public Student(String name, String group, int course, Calendar birthDate) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.birthDate = birthDate;
    }

    public String getFormattedDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(birthDate);
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDate() {
        return birthDate;
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

    @Override
    public String toString() {
        return "Student{" + "name='" + name
                + '\'' + ", group='" + group + '\'' + ", course=" + course + ", birthDate=" + getFormattedDate() + '}';
    }
}
