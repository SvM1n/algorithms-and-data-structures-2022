package ru.mirea.practice.task3;

abstract class Tester {
    public static void main(String[] args) {
        Animal an = new Animal("Dog");
        Person person = new Person("Кик Бутовски");
        Product product = new Product("Кола");
        System.out.println(product.getName());
        System.out.println(an.getName());
        System.out.println(person.getName());
    }
}
