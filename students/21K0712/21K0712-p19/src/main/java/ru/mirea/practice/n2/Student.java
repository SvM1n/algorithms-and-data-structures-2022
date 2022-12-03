package ru.mirea.practice.n2;

public class Student {
    int mark;
    private String name;
    private String speciality;
    private int course;
    private String group;

    Student(String name, String speciality, int course, String group, int mark) {
        this.name = name;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.mark = mark;
    }

    Student() {
        this.name = "";
        this.speciality = "";
        this.course = 0;
        this.group = "";
        this.mark = 0;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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

    @Override
    public String toString() {
        return "Student{"
                +
                "mark=" + mark
                +
                ", name='" + name + '\''
                +
                ", speciality='" + speciality + '\''
                +
                ", course=" + course
                +
                ", group='" + group + '\''
                +
                '}';
    }
}
