package mirea.practice.task2to3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MyList<E> implements Iterable<E> {
    private List<E> arr;
    private int index;

    public MyList(List<E> arr) {
        this.arr = arr;
        this.index = 0;
    }

    public void add(E e) {
        arr.add(e);
    }

    public E remove(int idx) {
        return arr.remove(idx);
    }

    public E get(int idx) {
        return arr.get(idx);
    }

    public void set(int idx, E e) {
        arr.set(idx, e);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            @Override
            public boolean hasNext() {
                return index < arr.size();
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E result = arr.get(index);
                index++;
                return result;
            }
        };
    }
}
