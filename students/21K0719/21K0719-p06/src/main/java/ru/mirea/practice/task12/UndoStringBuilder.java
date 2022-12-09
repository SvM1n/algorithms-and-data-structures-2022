package ru.mirea.practice.task12;

import java.util.Stack;

public class UndoStringBuilder {
    private String strings;

    private Stack<Action> operations;

    public UndoStringBuilder(String strings) {
        this.strings = strings;
        operations = new Stack<>();
    }

    public void undo() {
        if (!operations.isEmpty()) {
            operations.pop().undo();
        }
    }

    public UndoStringBuilder reverse() {
        strings = new StringBuilder(strings).reverse().toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).reverse().toString();
            }
        });
        return this;
    }

    public UndoStringBuilder append(String str) {
        strings = new StringBuilder(strings).append(str).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).delete(strings.length() - str.length(), strings.length()).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder insert(int index, String str) {
        strings = new StringBuilder(strings).insert(index, str).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).delete(index, str.length() + index).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder replace(int start, int end, String str) {
        String deleted = strings.substring(start, end);
        strings = new StringBuilder(strings).replace(start, end, str).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).deleteCharAt(start).insert(start, deleted).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder delete(int start, int end) {
        String deleted = strings.substring(start, end);
        strings = new StringBuilder(strings).delete(start, end).toString();
        operations.add(new Action() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).insert(start, deleted).toString();
            }
        });
        return this;
    }


    @Override
    public String toString() {
        return strings;
    }
}
