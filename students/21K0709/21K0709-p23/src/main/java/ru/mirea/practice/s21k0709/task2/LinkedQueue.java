package ru.mirea.practice.s21k0709.task2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class LinkedQueue<T> implements Queue<T> {
    Queue<T> arrayQueue;

    @Override
    public int size() {
        return arrayQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return arrayQueue.size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        boolean flag = false;
        for (int i = 0; i < arrayQueue.size(); i++) {
            if (arrayQueue.element().equals(o)) {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public Object[] toArray() {
        return arrayQueue.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return a;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return arrayQueue.remove(o);
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean add(T t) {
        return arrayQueue.add(t);
    }

    @Override
    public boolean containsAll(Collection<?> collect) {
        return arrayQueue.contains(collect);
    }

    @Override
    public boolean removeAll(Collection<?> collect) {
        return arrayQueue.remove(collect);
    }

    @Override
    public boolean addAll(Collection<? extends T> collect) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collect) {
        return false;
    }

    @Override
    public void clear() {
        arrayQueue.remove(0);
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