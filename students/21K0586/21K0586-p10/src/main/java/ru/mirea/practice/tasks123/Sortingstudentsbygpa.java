package ru.mirea.practice.tasks123;

public abstract class Sortingstudentsbygpa {
    public static void quickSortgrade(Student[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }

        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i].grade(opora)) {
                i++;
            }

            while (array[j].grade(opora)) {
                j--;
            }

            if (i <= j) { //меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSortgrade(array, low, j);
        }

        if (high > i) {
            quickSortgrade(array, i, high);
        }
    }

    public static void insertionSortgrade(Student[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            Student swap = sortArr[i];
            for (j = i; j > 0 && swap.grade(sortArr[j - 1]); j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

    public static void quickSortcourse(Student[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        Student opora = array[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i].course(opora)) {
                i++;
            }

            while (array[j].course(opora)) {
                j--;
            }

            if (i <= j) { //меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSortgrade(array, low, j);
        }

        if (high > i) {
            quickSortcourse(array, i, high);
        }
    }

    public static void insertionSortcourse(Student[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            Student swap = sortArr[i];
            for (j = i; j > 0 && swap.grade(sortArr[j - 1]); j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
}
