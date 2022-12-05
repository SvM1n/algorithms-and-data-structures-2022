package ru.mirea.practice.task1;

public class InnNotFoundException extends Exception {
    public InnNotFoundException(String thisUserHasAnotherInn) {
        super(thisUserHasAnotherInn);
    }
}
