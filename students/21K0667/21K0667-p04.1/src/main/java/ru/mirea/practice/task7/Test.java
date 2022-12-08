package ru.mirea.practice.task7;

public abstract class Test {
    public static void main(String[] args) {
        Learner[] test = {new Pupil("Иван Иванов", 6, 1),
            new Student("Петя Петькин", 18, 1, "АААА-00-00")};
        System.out.println(test[0]);
        System.out.println(test[1]);
    }
}
