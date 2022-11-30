package mirea.practice.task2;

public abstract class Main {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student(56, 21456, "Б.Г.А"),
            new Student(67, 21375, "И.Д.М"),
            new Student(43, 21654, ""),
            new Student(12, 21325, "Т.А.В"),
            new Student(32, 21934, "Б.В.С"),
        };
        try {
            StudentSortByName.qsort(students, 0, students.length - 1);

            for (Student student : students) {
                System.out.println(student);
            }
        } catch (EmptyStringException exception) {
            System.err.println(exception.getMessage());
        }

    }
}
