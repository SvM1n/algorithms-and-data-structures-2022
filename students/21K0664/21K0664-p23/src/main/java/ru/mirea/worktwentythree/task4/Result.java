package ru.mirea.worktwentythree.task4;

import java.util.ArrayList;
import java.util.List;

public class Result {

    public Result(String expression) {
        this.expression = expression;
    }

    public Result(String expression, Result a) {
        this.expression = expression;
        args.add(a);
    }

    public Result(String expression, Result a, Result b) {
        this.expression = expression;
        args.add(a);
        args.add(b);
    }

    public String expression;
    List<Result> args = new ArrayList<>();
}
