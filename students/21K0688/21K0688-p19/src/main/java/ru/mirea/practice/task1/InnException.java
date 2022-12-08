package ru.mirea.practice.task1;

public class InnException extends Exception {
    public InnException(String message, InnException e) {
        super(message, e);
    }

    public InnException(String message) {
        super(message);
    }
}
