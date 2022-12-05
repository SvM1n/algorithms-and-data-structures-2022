package ru.mirea.practice.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String group;
    private int level;
    private String specialization;
    private double gpa;
    private Date birth;

    public Student(String name, String group, int level, String specialization, double gpa, Date birth) {
        this.name = name;
        this.group = group;
        this.level = level;
        this.specialization = specialization;
        this.gpa = gpa;
        this.birth = birth;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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
        SimpleDateFormat smd = new SimpleDateFormat("MM-dd-yyyy");
        return "Student{"
                + "name='" + name + '\''
                + ", group='" + group + '\''
                + ", level=" + level
                + ", specialization='" + specialization + '\''
                + ", gpa=" + gpa
                + ", birth=" + smd.format(birth)
                + '}';
    }
}
