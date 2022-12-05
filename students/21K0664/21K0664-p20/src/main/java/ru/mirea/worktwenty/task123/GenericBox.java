package ru.mirea.worktwenty.task123;


public class GenericBox<T extends String, V extends Animal, K extends Number> {
    private final T content1;
    private final V content2;
    private final K content3;

    public GenericBox(T t, V v, K k) {
        content1 = t;
        content2 = v;
        content3 = k;
    }

    public K getContent3() {
        return content3;
    }

    public V getContent2() {
        return content2;
    }

    public T getContent1() {
        return content1;
    }

    public void show() {
        System.out.println("content1: " + content1.getClass().getName());
        System.out.println("content2: " + content2.getClass().getName());
        System.out.println("content2: " + content3.getClass().getName());
    }


    @Override
    public String toString() {
        return "GenericBox{" + "content1=" + content1 + ", content2=" + content2 + ", content3=" + content3 + '}';
    }

}
