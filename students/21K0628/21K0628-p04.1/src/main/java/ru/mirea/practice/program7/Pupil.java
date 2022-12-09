package ru.mirea.practice.program7;

public class Pupil {
    private String firstname;
    private String lastname;

    public Pupil(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getName() {
        return firstname + " " + lastname;
    }
}
