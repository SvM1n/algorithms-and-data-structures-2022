package ru.mirea.workfourteen.task2;

import java.util.regex.Pattern;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        System.out.println(pattern.matcher("abcdefghijklmnopqrstuv18340").matches());
        System.out.println(pattern.matcher("abcdefghijklmnoasdfasdpqrstuv18340").matches());
    }
}
