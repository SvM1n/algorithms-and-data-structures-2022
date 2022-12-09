package ru.mirea.practice.s21k0709;

public abstract class Tester {
    public static void main(String[] args) {
        Generalized<String,Butterfly,Integer> generalized = new Generalized<>("Информация: ",
                new Butterfly(22,"м","Красный"),1);
        System.out.println(generalized.getTName() + " " + generalized.getT());
        System.out.println(generalized.getVName() + " " + generalized.getV());
        System.out.println(generalized.getKName() + " " + generalized.getK());
    }
}
