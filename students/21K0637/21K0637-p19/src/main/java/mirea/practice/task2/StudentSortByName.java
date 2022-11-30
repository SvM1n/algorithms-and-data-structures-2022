package mirea.practice.task2;

public abstract class StudentSortByName {
    static void qsort(Student[] students, int start, int end) throws EmptyStringException {
        if (start < end) {
            int partitionIdx = partition(students, start, end);

            qsort(students, start, partitionIdx - 1);
            qsort(students, partitionIdx + 1, end);
        }
    }

    private static int partition(Student[] students, int start, int end) throws EmptyStringException {
        Student pivot = students[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if ("".equals(students[j].getFullName())) {
                throw new EmptyStringException("Empty full name in " + students[j]);
            }
            if (students[j].compareTo(pivot) < 0) {
                i++;

                Student tmp = students[i];
                students[i] = students[j];
                students[j] = tmp;
            }
        }

        Student tmp = students[i + 1];
        students[i + 1] = students[end];
        students[end] = tmp;

        return i + 1;
    }
}
