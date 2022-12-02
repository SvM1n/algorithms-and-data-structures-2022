package ru.mirea.practice.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTab<K, V> {
    private List<Node<K, V>> list;

    private class Node<K, V> {
        public K key;
        public V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Node<?, ?> node = (Node<?, ?>) o;
            return key.equals(node.key) && value.equals(node.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

    public HashTab() {
        list = new ArrayList<>();
    }

    public void hashAdd(K key, V value) {
        for (Node<K, V> node : list) {
            if (node.hashCode() == Objects.hash(key, value)) {
                System.out.println("Object " + key + ": " + value + " already added");
                return;
            }

        }
        list.add(new Node<>(key, value));
    }

    public boolean hashDelete(K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).key.equals(key)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public void hashLookup() {
        for (Node<K, V> node : list) {
            System.out.println(node.key + ": " + node.value);
        }
    }

    public int hashtableHash(K key) {
        for (Node<K, V> node : list) {
            if (node.key.equals(key)) {
                return node.hashCode();
            }
        }
        return 0;

    }


}
