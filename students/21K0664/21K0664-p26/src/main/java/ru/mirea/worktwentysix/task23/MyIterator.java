package ru.mirea.worktwentysix.task23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyIterator implements Iterable<Integer> {
    private final List<Integer> arr;

    public MyIterator(List<Integer> data) {
        arr = new ArrayList<>(data);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterators(arr);
    }
}

