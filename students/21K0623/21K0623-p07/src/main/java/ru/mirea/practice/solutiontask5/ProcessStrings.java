package ru.mirea.practice.solutiontask5;

public class ProcessStrings implements StringChange {
    private final String string;

    public ProcessStrings(String string) {
        this.string = string;
    }

    @Override
    public int lenString() {
        return this.string.length();
    }

    @Override
    public String oddString() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < this.string.length(); i++) {
            if (i % 2 == 1) {
                temp.append(this.string.charAt(i));
            }
        }
        return temp.toString();
    }

    @Override
    public String invert() {
        StringBuilder temp = new StringBuilder();
        for (int i = this.string.length() - 1; i >= 0; i--) {
            temp.append(this.string.charAt(i));
        }
        return temp.toString();
    }
}
