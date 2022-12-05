package ru.mirea.practice.s21k0647.zad3;

public class Planet implements Nameable {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
