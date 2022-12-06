package ru.mirea.worknine.task1;

public class Student {
    private String name;
    private int idNumber;
    private double averageMark;
    private String group;

    public Student(String name, int idNumber, double averageMark, String group) {
        this.name = name;
        this.idNumber = idNumber;
        this.averageMark = averageMark;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", idNumber=" + idNumber + ", averageMark=" + averageMark + ", group='" + group + '\'' + '}';
    }

    public Student[] insertionSort(Student[] arr) {
        for (int left = 0; left < arr.length; left++) {
            Student value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.idNumber < arr[i].idNumber) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
        return arr;
    }
}
