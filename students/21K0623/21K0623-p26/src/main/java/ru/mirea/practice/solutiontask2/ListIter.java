package ru.mirea.practice.solutiontask2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIter implements Iterable<Integer> {
    private final List<Integer> list;

    public ListIter(List<Integer> list) {
        this.list = new ArrayList<>(list);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterators(list);
    }
}
