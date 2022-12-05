package ru.mirea.practice.task1to3;

public abstract class Tester {
    public static void main(String[] args) {
        GenericClass<String,Bird,Integer> genericClass = new GenericClass<>("String content",
                new Bird(22,"Red","Hunter"),124);
        System.out.println(genericClass.getTcontentName() + " " + genericClass.getTcontent());
        System.out.println(genericClass.getVcontentName() + " " + genericClass.getVcontent());
        System.out.println(genericClass.getKcontentName() + " " + genericClass.getKcontent());
    }

}
