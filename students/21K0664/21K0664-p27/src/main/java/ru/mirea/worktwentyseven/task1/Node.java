package ru.mirea.worktwentyseven.task1;

public class Node<K, V> {
    public Node<K, V> next;
    public Node<K, V> prev;
    public K key;
    public V value;

    public Node(K k, V v) {
        key = k;
        value = v;
    }

    public String print() {
        String data = "(" + key + "," + value + ")";
        if (next != null) {
            return data + "->" + next.print();
        } else {
            return data;
        }
    }
}

