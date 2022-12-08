package ru.mirea.practice.task4;

abstract class Tester {
    public static void main(String[] args) {
        Car car = new Car(10000);
        Phone phone = new Phone(15000);
        System.out.println(car.getPrice());
        System.out.println(phone.getPrice());
    }
}
