package ru.mirea.practice.task3;

import java.util.Calendar;

public class Student {
    private String lastName;
    private String specially;
    private int course;
    private String group;
    private int averageMark;
    private Calendar dateOfBirthday = Calendar.getInstance();

    public Student(String lastName, String specially, int course, String group, int averageMark, int year, int month, int day) {
        this.lastName = lastName;
        this.specially = specially;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
        dateOfBirthday.set(year, month - 1, day);
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(int averageMark) {
        this.averageMark = averageMark;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecially() {
        return specially;
    }

    public void setSpecially(String specially) {
        this.specially = specially;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Calendar getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Calendar dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public String toString() {
        return "Student{ "
            + "lastName: '" + lastName + '\''
            + "Birth: " + dateOfBirthday
            + ", specially '" + specially + '\''
            + ", course: " + course
            + ", group: '" + group + '\''
            + ", average mark: '" + averageMark + '\''
            + '}';
    }
}
