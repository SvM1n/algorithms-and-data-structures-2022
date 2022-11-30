package ru.mirea.worktwentyseven.task1;

import java.util.ArrayList;
import java.util.List;

public class HashTab<K, V> {
    private final List<Node<K, V>> arr;

    public HashTab(int n) {
        arr = new ArrayList<>();

        ((ArrayList<Node<K, V>>) arr).ensureCapacity(n);

        for (int i = 0; i < n; i++) {
            arr.add(null);
        }
    }

    public int getIndexForKey(K key) {
        return Math.abs(key.hashCode() % arr.size());
    }

    private Node<K, V> hashtabHash(K key) {
        int index = getIndexForKey(key);
        Node<K, V> current = arr.get(index);
        while (current != null) {
            if (current.key.equals(key)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public V hashtabAdd(K k, V v) {
        Node<K, V> node = hashtabHash(k);
        if (node != null) {
            V oldValue = node.value;
            node.value = v;
            return oldValue;
        }
        node = new Node<K, V>(k, v);
        int index = getIndexForKey(k);
        if (arr.get(index) != null) {
            node.next = arr.get(index);
            node.next.prev = node;
        }
        arr.set(index, node);
        return null;
    }

    public V hashtabDelete(K k) {
        Node<K, V> node = hashtabHash(k);
        if (node == null) {
            return null;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            int hashKey = getIndexForKey(k);
            arr.set(hashKey, node.next);
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }
        return node.value;
    }


    public void printHash() {
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i) == null ? "" : arr.get(i).print();
            System.out.println(i + ": " + s);
        }
    }
}

