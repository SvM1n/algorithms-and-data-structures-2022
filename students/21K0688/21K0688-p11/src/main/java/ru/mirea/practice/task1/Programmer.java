package ru.mirea.practice.task1;

import java.util.Date;

public class Programmer {
    private String name;
    private Date start;
    private Date end;

    public Programmer(String name, Date start) {
        this.name = name;
        this.start = start;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Programmer{"
                + "Имя: '" + name + '\''
                + ", дата получения задания: " + start
                + ", дата сдачи задания: " + end
                + '}';
    }
}
