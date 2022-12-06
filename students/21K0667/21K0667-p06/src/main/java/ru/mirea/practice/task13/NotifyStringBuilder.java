package ru.mirea.practice.task13;

public class NotifyStringBuilder {
    private Change listener;
    private String strings;

    public NotifyStringBuilder(String string) {
        strings = string;
        listener = new Listener();
    }

    public void notifyChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    public NotifyStringBuilder append(String str) {
        strings = new StringBuilder(strings).append(str).toString();
        notifyChange();
        return this;
    }

    public NotifyStringBuilder delete(int start, int end) {
        strings = new StringBuilder(strings).delete(start, end).toString();
        notifyChange();
        return this;
    }

    public NotifyStringBuilder insert(int start, String str) {
        strings = new StringBuilder(strings).insert(start, str).toString();
        notifyChange();
        return this;
    }

    public NotifyStringBuilder replace(int start, int end, String str) {
        strings = new StringBuilder(strings).replace(start, end, str).toString();
        notifyChange();
        return this;
    }

    public NotifyStringBuilder reverse() {
        strings = new StringBuilder(strings).reverse().toString();
        notifyChange();
        return this;
    }

    @Override
    public String toString() {
        return strings.toString();
    }
}