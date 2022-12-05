package ru.mirea.worktwentythree.task2;

public abstract class AbstractQueue implements Queue {
    protected int size;

    @Override
    public void enqueue(Object element) {
        assert element != null;
        enqueueImpl(element);
        size++;
    }

    protected abstract void enqueueImpl(Object element);

    @Override
    public Object dequeue() {
        assert size > 0;
        Object result = element();
        size--;
        remove();
        return result;
    }

    protected abstract void remove();

    @Override
    public Object element() {
        assert size > 0;
        return elementImpl();
    }

    protected abstract Object elementImpl();

    @Override
    public Object[] toArray() {
        if (size == 0) {
            return new Object[0];
        } else {
            Object[] newElements = new Object[size];
            newElements = toArrayImpl(newElements);
            return newElements;
        }
    }

    protected abstract Object[] toArrayImpl(Object[] newElements);

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        clearImpl();
        size = 0;
    }

    protected abstract void clearImpl();
}
