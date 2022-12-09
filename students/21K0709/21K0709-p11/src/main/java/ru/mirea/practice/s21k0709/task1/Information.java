package ru.mirea.practice.s21k0709.task1;

import java.util.Date;

public class Information {
    private Date receivedDate;
    private final String fio;
    private Date passedDate;

    public Information(Date receivedDate, String fio) {
        this.receivedDate = receivedDate;
        this.fio = fio;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public Date getPassedDate() {
        return passedDate;
    }

    public void setPassedDate(Date passedDate) {
        this.passedDate = passedDate;
    }

    @Override
    public String toString() {
        return "Information{"
                +
                "receivedDate=" + receivedDate
                +
                ", fio='" + fio + '\''
                +
                ", passedDate=" + passedDate
                +
                '}';
    }
}