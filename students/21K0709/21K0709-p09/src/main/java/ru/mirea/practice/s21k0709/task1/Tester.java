package ru.mirea.practice.s21k0709.task1;

import java.util.Arrays;

public class Tester {

    private int length;

    private Student[] mas;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Student[] getMas() {
        return mas;
    }

    public void setMas(Student[] mas) {
        this.mas = mas;
    }



    Tester(int length) {
        this.length = length;
        this.mas = new Student[length];
    }


    public void setStudents(Student k, int n) {
        this.mas[n] = k;
    }

    @Override
    public String toString() {
        return "Tester{"
                +
                "n=" + length
                +
                ", a=" + Arrays.toString(mas)
                +
                '}';
    }

    public void sort() {
        int j = 0;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = this.mas[i].age;
            for (j = i; j > 0 && swap < this.mas[j - 1].age; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                this.mas[j].age = this.mas[j - 1].age;
            }
            this.mas[j].age = swap;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ravenclaw", 19,"male");
        Student student2 = new Student("Max", "Hufflepuff", 17, "male");
        Student student3 = new Student("Anna", "Gryffindor", 16,"female");
        Student student4 = new Student("Kirill", "Hufflepuff", 20, "male");
        Student student5 = new Student("Germiona", "Gryffindor", 15,"female");

        Tester iDNumber = new Tester(5);
        iDNumber.setStudents(student1, 0);
        iDNumber.setStudents(student2, 1);
        iDNumber.setStudents(student3, 2);
        iDNumber.setStudents(student4, 3);
        iDNumber.setStudents(student5, 4);
        System.out.println("Было: " + iDNumber);

        iDNumber.sort();

        System.out.println("Стало: " + iDNumber);
    }
}