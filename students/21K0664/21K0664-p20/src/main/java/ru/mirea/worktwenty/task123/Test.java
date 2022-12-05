package ru.mirea.worktwenty.task123;

public abstract class Test {
    public static void main(String[] args) {
        GenericBox<String, Animal, Number> t = new GenericBox<>("qweq", new Animal(), new Number());
        t.show();
    }
}
