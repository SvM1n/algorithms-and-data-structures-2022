package ru.mirea.practice.task7;

public abstract class Tester {
    public static void main(String[] args) {
        Learner[] arr = {new Schoolboy("Арсюша Худякоу", 16, 10),
            new Student("Арсюша Худякоу2", 19, 2, "КВБО-03-21")};

        System.out.print(arr[0]);
        System.out.println("\n" + arr[1]);
    }
}
