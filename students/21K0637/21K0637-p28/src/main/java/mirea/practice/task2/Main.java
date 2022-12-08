package mirea.practice.task2;

public abstract class Main {
    public static void main(String[] args) {
        Map database = new Map();
        database.createMap();

        System.out.println(database.getSameFirstName());
        System.out.println(database.getSameLastName());
    }
}
