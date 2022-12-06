package ru.mirea.practice.program7;

public final class Tester {
    private Tester() {
    }

    public static void main(String[] args) {
        Schoolchild schoolchild1 = new Schoolchild("Maria", "Ivanova", 10);
        Schoolchild schoolchild2 = new Schoolchild("Kate", "Volkova", 5);
        Student student1 = new Student("Inessa", "Kim", 2);
        Student student2 = new Student("Den", "Alexseev", 1);
        Pupil[] pupils = {schoolchild1, schoolchild2, student1, student2};
        for (Pupil pupil : pupils) {
            System.out.println(pupil);
        }
    }
}
