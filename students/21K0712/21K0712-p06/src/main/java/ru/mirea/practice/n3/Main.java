package ru.mirea.practice.n3;

abstract class Main {
    public static void main(String[] args) {
        Countries c = new Countries();
        c.setName("Russia");
        Planets p = new Planets();
        p.setName("Earth");
        System.out.println(c.getName() + " " + p.getName());
    }
}
