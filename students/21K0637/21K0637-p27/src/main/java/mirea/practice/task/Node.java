package mirea.practice.task;

import java.util.Objects;

public class Node<K, V> {
    private Node<K, V> next;
    private Node<K, V> prev;
    private K key;
    private V value;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public Node<K, V> getPrev() {
        return prev;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    public void setPrev(Node<K, V> prev) {
        this.prev = prev;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        Node<?, ?> node = (Node<?, ?>) o;
        return Objects.equals(key, node.getKey()) && Objects.equals(value, node.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "{" + key + ":" + value + "}";
    }
}
