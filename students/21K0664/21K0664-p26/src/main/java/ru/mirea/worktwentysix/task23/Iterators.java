package ru.mirea.worktwentysix.task23;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Iterators implements Iterator<Integer> {
    private final List<Integer> arr;
    private int index;
    private boolean removeCalled;

    Iterators(List<Integer> list) {
        this.arr = list;
        index = 0;
        removeCalled = false;
    }

    @Override
    public boolean hasNext() {
        return index < arr.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer result = arr.get(index);
        index++;
        return result;
    }

    @Override
    public void remove() {
        if (removeCalled) {
            throw new IllegalStateException();
        }
        if (index == 0) {
            throw new IllegalStateException();
        }
        index--;
        arr.remove(index);
        removeCalled = true;
    }
}

