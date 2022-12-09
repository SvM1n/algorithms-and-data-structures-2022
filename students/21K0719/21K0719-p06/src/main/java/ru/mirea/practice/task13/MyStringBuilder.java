package ru.mirea.practice.task13;

public class MyStringBuilder {
    private Change listener;
    private String string;

    public MyStringBuilder(String string) {
        this.string = string;
        listener = new MyListener();
    }

    public void notifyChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    public MyStringBuilder reverse() {
        string = new StringBuilder(string).reverse().toString();
        notifyChange();
        return this;
    }

    public MyStringBuilder append(String str) {
        string = new StringBuilder(string).append(str).toString();
        notifyChange();
        return this;
    }

    public MyStringBuilder insert(int start, String str) {
        string = new StringBuilder(string).insert(start, str).toString();
        notifyChange();
        return this;
    }

    public MyStringBuilder replace(int start, int end, String str) {
        string = new StringBuilder(string).replace(start, end, str).toString();
        notifyChange();
        return this;
    }

    public MyStringBuilder delete(int start, int end) {
        string = new StringBuilder(string).delete(start, end).toString();
        notifyChange();
        return this;
    }

    @Override
    public String toString() {
        return string;
    }

}
