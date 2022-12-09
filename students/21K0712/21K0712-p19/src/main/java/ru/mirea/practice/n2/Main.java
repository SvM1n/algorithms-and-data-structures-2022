package ru.mirea.practice.n2;

import java.util.ArrayList;
import java.util.List;

abstract class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("ghoul 1000-7", "literally me", 228, "zxc dead inside", 993));
        list.add(new Student("vasya pupkin", ",ya", 11, "asdfasdf", 1000));
        list.add(new Student("asdfasdf", "pchel", 2, "zemnovodnie", 7));

        Sort s = new Sort();
        list.sort(s);

        for (Student student : list) {
            System.out.println(student.getMark());
        }
        try {
            System.out.println(s.search(list));
        } catch (FioException e) {
            System.out.println(e.getMessage());
        }
    }
}
