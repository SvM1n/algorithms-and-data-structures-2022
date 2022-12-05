package ru.mirea.practice.solutiontask1;

public class Student {
    private String firstname;
    private String lastname;
    private String specialization;
    private int course;
    private String group;
    private int gpa;

    public Student(String firstname, String lastname, String specialization, String group, int course, int gpa) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialization = specialization;
        this.group = group;
        this.course = course;
        this.gpa = gpa;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return lastname + " " + firstname + "\n" + specialization + "\ncourse: " + course + "\n" + group + "\ngpa: " + gpa;
    }
}
