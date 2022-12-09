package ru.mirea.practice.solutiontask2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue<T> implements Queue<T> {
    Queue<T> array;

    @Override
    public int size() {
        return array.size();
    }

    @Override
    public boolean isEmpty() {
        return array.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean a = false;
        for (int i = 0; i < array.size(); i++) {
            if (array.element().equals(o)) {
                a = true;
            }
        }
        return a;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return array.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] collect) {
        return collect;
    }

    @Override
    public boolean add(T t) {
        return array.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return array.remove(o);
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> collect) {
        return array.contains(collect);
    }

    @Override
    public boolean addAll(Collection<? extends T> collect) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collect) {
        return array.remove(collect);
    }

    @Override
    public boolean retainAll(Collection<?> collect) {
        return false;
    }

    @Override
    public void clear() {
        array.remove(0);
    }

    @Override
    public boolean offer(T t) {
        return false;
    }

    @Override
    public T poll() {
        return null;
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }
}
