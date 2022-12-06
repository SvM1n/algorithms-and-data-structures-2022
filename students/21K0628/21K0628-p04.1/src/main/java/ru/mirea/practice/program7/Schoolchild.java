package ru.mirea.practice.program7;

public class Schoolchild extends Pupil {
    private int grate;

    public Schoolchild(String firstname, String lastname, int grate) {
        super(firstname, lastname);
        this.grate = grate;
    }

    @Override
    public String toString() {
        return "Schoolchild{Name: " + super.getName() + ", grate = " + grate + '}';
    }
}
