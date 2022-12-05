package ru.mirea.practice.s21k0647.zad12;

import java.util.Stack;

public class UndoStringBuilder {
    protected String string00;

    private Stack<Action> operations;


    public UndoStringBuilder() {
        operations = new Stack<>();
        this.string00 = "";
    }

    public UndoStringBuilder reverse() {
        string00 = new StringBuilder(string00).reverse().toString();
        operations.add(new Action() {

            @Override
            public void undo() {
                string00 = new StringBuilder(string00).reverse().toString();
            }
        });
        return this;
    }

    public UndoStringBuilder append(String string) {
        string00 = new StringBuilder(string00).append(string).toString();
        operations.add(new Action() {

            @Override
            public void undo() {
                string00 = new StringBuilder(string00).append(string).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder insert(int start, String string) {

        this.string00 = new StringBuilder(this.string00).insert(start, string).toString();
        operations.add(new Action() {

            @Override
            public void undo() {
                string00 = new StringBuilder(string00).insert(start, string).toString();
            }
        });
        return this;
    }

    public UndoStringBuilder replace(int start, int end, String replaceString) {
        String replacedString = this.string00.substring(start, end);
        this.string00 = new StringBuilder(this.string00).replace(start, end, replaceString).toString();
        operations.add(new Action() {

            @Override
            public void undo() {
                string00 = new StringBuilder(string00).replace(start, end, replacedString).toString();
            }
        });
        return this;

    }

    public UndoStringBuilder delete(int start, int end) {
        String deletedString = this.string00.substring(start, end);
        this.string00 = new StringBuilder(this.string00).delete(start, end).toString();
        operations.add(new Action() {

            @Override
            public void undo() {
                string00 = new StringBuilder(string00).insert(start, deletedString).toString();
            }
        });
        return this;
    }

    public void undo() {
        if (!operations.isEmpty()) {
            operations.pop().undo();
        }
    }

    @Override
    public String toString() {
        return string00;
    }
}