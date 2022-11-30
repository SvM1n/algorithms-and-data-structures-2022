package ru.mirea.practice.solutiontask12;

import java.util.Stack;

public class StringBuilderUndo {
    private String string = "";
    private final Stack<Operations> operations = new Stack<>();

    public StringBuilderUndo append(String str) {
        string = string + str;
        operations.add(() -> string = new StringBuilder(string).delete(string.length() - str.length(), string.length()).toString());
        return this;
    }

    public StringBuilderUndo delete(int start, int end) {
        String out = string.substring(start, end);
        string = new StringBuilder(string).delete(start, end).toString();
        operations.add(() -> string = new StringBuilder(string).insert(start, out).toString());
        return this;
    }

    public StringBuilderUndo reverse() {
        string = new StringBuilder(string).reverse().toString();
        operations.add(() -> string = new StringBuilder(string).reverse().toString());
        return this;
    }

    public StringBuilderUndo insert(int i, String str) {
        string = new StringBuilder(string).insert(i, str).toString();
        operations.add(() -> string = new StringBuilder(string).delete(i, str.length() + i).toString());
        return this;
    }

    public StringBuilderUndo replace(int start, int end, String str) {
        String out = string.substring(start, end);
        string = new StringBuilder(string).replace(start, end, str).toString();
        operations.add(() -> string = new StringBuilder(string).replace(start, end, out).toString());
        return this;
    }

    public void undo() {
        if (!operations.isEmpty()) {
            operations.pop().undo();
        }
    }

    @Override
    public String toString() {
        return string;
    }
}

