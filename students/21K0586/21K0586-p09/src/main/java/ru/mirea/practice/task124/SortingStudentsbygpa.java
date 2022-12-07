package ru.mirea.practice.task124;

public abstract class SortingStudentsbygpa {
    public static void quickSort(Student[] array, int low, int high) {
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
            while (array[i].isLess(opora)) {
                i++;
            }

            while (array[j].isLess(opora)) {
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
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static void insertionSort(Student[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            Student swap = sortArr[i];
            for (j = i; j > 0 && swap.isLess(sortArr[j - 1]); j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }
}
