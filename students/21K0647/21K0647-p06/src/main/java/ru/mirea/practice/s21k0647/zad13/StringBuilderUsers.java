package ru.mirea.practice.s21k0647.zad13;



class StringBuilderUsers {


    private StringBuilderListener listener;

    private String string;

    // Сеттер для onChangeListener
    public void setChangeListener(StringBuilderListener onChangeListener) {
        this.listener = onChangeListener;
    }

    public StringBuilderUsers() {
        string = new StringBuilder().toString();
    }

    private void stringBuilderUsers() {
        if (listener != null) {
            listener.onChange(this);
        }
    }

    public StringBuilderUsers append(Object obj) {
        string = String.valueOf(new StringBuilder(string).append(obj));
        this.stringBuilderUsers();
        return this;
    }

    public StringBuilderUsers replace(int start, int end, String str) {
        string = String.valueOf(new StringBuilder(string).replace(start, end, str));
        this.stringBuilderUsers();
        return this;
    }

    @Override
    public String toString() {
        return string;
    }

}




