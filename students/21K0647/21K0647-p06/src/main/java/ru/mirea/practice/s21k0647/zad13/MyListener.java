package ru.mirea.practice.s21k0647.zad13;

class MyListener implements StringBuilderListener {
    @Override
    public void onChange(StringBuilderUsers stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}
