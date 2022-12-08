package ru.mirea.practice.solutiontask1;

public final class Main {
    private Main() {}

    public static void main(String[] args) {
        Generality<String,Animal,Integer> genericClass = new Generality<>("String content", new Animal("иглокожие"),4);
        System.out.println(genericClass.getTen());
        System.out.println(genericClass.getVen());
        System.out.println(genericClass.getKen());
        genericClass.printName();
    }
}
