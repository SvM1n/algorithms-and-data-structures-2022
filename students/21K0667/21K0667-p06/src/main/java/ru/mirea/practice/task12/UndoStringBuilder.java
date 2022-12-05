package ru.mirea.practice.task12;

import java.util.Stack;

public class UndoStringBuilder implements Operation {
    private Stack<Operation> undoOperations;
    private String strings;

    public UndoStringBuilder(String strings) {
        undoOperations = new Stack<Operation>();
        this.strings = strings;
    }

    @Override
    public void undo() {
        if (!undoOperations.empty()) {
            undoOperations.pop().undo();
        }
    }

    public UndoStringBuilder append(String str) {
        strings = new StringBuilder(strings).append(str).toString();
        undoOperations.add(new Operation() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).delete(strings.length() - str.length(), strings.length()).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder delete(int start, int end) {
        String deleted = strings.substring(start, end);
        strings = new StringBuilder(strings).delete(start, end).toString();
        undoOperations.add(new Operation() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).insert(start, deleted).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder insert(int index, String str) {
        strings = new StringBuilder(strings).insert(index, str).toString();
        undoOperations.add(new Operation() {
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
        undoOperations.add(new Operation() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).deleteCharAt(start).insert(start, deleted).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder reverse() {
        strings = new StringBuilder(strings).reverse().toString();
        undoOperations.add(new Operation() {
            @Override
            public void undo() {
                strings = new StringBuilder(strings).reverse().toString();
            }
        });
        return this;
    }

    public String toString() {
        return strings;
    }
}