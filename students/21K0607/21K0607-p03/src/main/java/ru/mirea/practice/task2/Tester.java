package ru.mirea.practice.task2;



public abstract class Tester {

    public static void main(String[] args) {
        int amountCircle = 3;
        Circle[] array = new Circle[amountCircle];
        for (int i = 0; i < amountCircle; i++) {
            Circle circle = new Circle();
            array[i] = circle;
        }
        circleSort(array);
        for (int i = 0; i < amountCircle; i++) {
            System.out.println(array[i]);
        }
        maxMinCircle(array);
    }

    public static void circleSort(Circle[] array) {
        for (int i = 0; i < array.length; i++) {
            Circle temp = new Circle();
            for (int j = 0; j < array.length; j++) {
                if (array[i].getRadius() > array[j].getRadius()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void maxMinCircle(Circle[] array) {
        circleSort(array);
        System.out.println("The smallest circle " + array[0]);
        System.out.println("The biggest circle " + array[array.length - 1]);
    }
}
