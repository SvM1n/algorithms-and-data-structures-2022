package mirea.practice.task4.parser;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public String expression;
    List<Result> args = new ArrayList<>();

    public Result(String expression) {
        this.expression = expression;
    }

    public Result(String expression, Result result) {
        this.expression = expression;
        args.add(result);
    }

    public Result(String expression, Result resultLeft, Result resultRight) {
        this.expression = expression;
        args.add(resultLeft);
        args.add(resultRight);
    }
}
