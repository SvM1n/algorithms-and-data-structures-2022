package ru.mirea.practice.task13;

public abstract class Test {
    public static void main(String[] args) {
        String test = "abcd";
        NotifyStringBuilder testBuild = new NotifyStringBuilder(test);
        testBuild.append("ef");
        testBuild.reverse();
        testBuild.insert(0, "aaa");
        testBuild.replace(0, 3, "fff");
        testBuild.delete(0, 2);
    }
}