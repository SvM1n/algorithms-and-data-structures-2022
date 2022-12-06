package ru.mirea.practice.solutiontask2;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Iterators implements Iterator<Integer> {
    private final List<Integer> list;
    private int i;
    private boolean removeCalled;

    public Iterators(List<Integer> list) {
        this.list = list;
        i = 0;
        removeCalled = false;
    }

    @Override
    public boolean hasNext() {
        return i < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer result = list.get(i);
        i++;
        return result;
    }

    @Override
    public void remove() {
        if (removeCalled) {
            throw new IllegalStateException();
        }
        if (i == 0) {
            throw new IllegalStateException();
        }
        i--;
        list.remove(i);
        removeCalled = true;
    }
}
