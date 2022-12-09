package ru.mirea.practice.solutiontask1;

import java.util.regex.Pattern;

public class User {
    private String fio;
    private String inn;

    public User(String fio, String inn) throws BadInnException {
        this.fio = fio;
        Pattern check = Pattern.compile("[0-9]{12}");
        if (!check.matcher(inn).matches()) {
            throw new BadInnException("is not an inn");
        } else {
            this.inn = inn;
        }
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return fio + " " + inn;
    }
}
