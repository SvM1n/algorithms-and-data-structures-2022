package ru.mirea.practice.task2;

public abstract class Test {
    public static void main(String[] args) {
        Phone testOne = new Phone();
        Phone testTwo = new Phone("+79161262938", "OnePlus Nord N10", 200);
        Phone testThree = new Phone("+79260242324", "Motorola A1200");
        System.out.println(testOne.receiveCall("Егор"));
        System.out.println(testTwo.receiveCall("Рома", "+79260242324"));
        System.out.println(testThree.receiveCall("Глеб", testTwo.getNumber()));
        testThree.sendMessage("+79568345678", "+78574561235", "+75473854908");
    }
}
