package ru.mirea.practice.task7;

public abstract class Tester {
    public static void main(String[] args) {
        Learner[] arr = {new Pupil("Паша Техник", 16, 10),
                         new Student("Трэвис Скотт", 22, 4, "КВБО-03-21")};

        System.out.print(arr[0]);
        System.out.println("\n" + arr[1]);
    }
}
