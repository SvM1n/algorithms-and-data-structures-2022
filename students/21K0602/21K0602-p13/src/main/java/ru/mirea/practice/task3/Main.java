package ru.mirea.practice.task3;

public abstract class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Russia, Moscow, Peredelkino,13 , 420, 69");
        Address address2 = new Address("Россия, Москва, проспект Вернадского, 78, 7, 11");
        Address address3 = new Address("USA, Hollywood, hz ;   234;  1; 23");
        Address address4 = new Address("UK, London, Trafalgar square, 2, 3, 4");
        System.out.println(address1.getAddress());
        System.out.println(address2.getAddress());
        System.out.println(address3.getAddress());
        System.out.println(address4.getAddress());
    }
}
