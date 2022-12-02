package ru.mirea.practice.solutiontask3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    private String firstname;
    private String lastname;
    private String specialization;
    private int course;
    private String group;
    private final Calendar dateofbirth = new GregorianCalendar();

    public Student(String firstname, String lastname, String specialization, String group, int course, int year, int month, int day) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialization = specialization;
        this.group = group;
        this.course = course;
        dateofbirth.set(year, month, day);
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

    @Override
    public String toString() {
        return lastname + " " + firstname + "\n" + specialization + "\ncourse: " + course + "\n" + group
                + "\ndate of birthday:" + dateofbirth.get(Calendar.YEAR)
                + "/" + dateofbirth.get(Calendar.MONTH)
                + "/" + dateofbirth.get(Calendar.DAY_OF_MONTH);
    }
}

