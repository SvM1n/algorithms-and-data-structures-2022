package mirea.practice.task2to3;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyListIterator<E> {
    private final List<E> arr;
    private int index;
    private boolean rmCalled;

    public MyListIterator(List<E> arr) {
        this.index = 0;
        this.arr = arr;
    }

    public void remove() {
        if (rmCalled) {
            throw new IllegalStateException();
        }
        if (index == 0) {
            throw new IllegalStateException();
        }
        index--;
        arr.remove(index);
        rmCalled = true;
    }

    public boolean hasNext() {
        return index < arr.size();
    }

    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E result = arr.get(index);
        index++;
        return result;
    }

    public void forEachRemaining(Consumer<? super E> action) {
        while (hasNext()) {
            action.accept(next());
        }
    }
}
