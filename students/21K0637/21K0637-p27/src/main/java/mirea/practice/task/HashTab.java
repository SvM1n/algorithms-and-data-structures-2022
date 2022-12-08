package mirea.practice.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTab<K, V> {
    private static final int DEFAULT_SIZE = 16;
    List<Node<K, V>> hashtable;

    public HashTab() {
        this.hashtable = new ArrayList<>();
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            hashtable.add(null);
        }
    }

    public int hashtabHash(K k) {
        return Objects.hash(k);
    }

    public void hashtabAdd(K k, V v) {
        Node<K, V> node = getNodeForKey(k);
        if (node != null) {
            node.setValue(v);
            return;
        }
        node = new Node<>(k, v);
        int index = getIndexForKey(k);
        if (hashtable.get(index) != null) {
            node.setNext(hashtable.get(index));
            node.getNext().setPrev(node);
        }
        hashtable.set(index, node);
    }

    public Node<K, V> getNodeForKey(K key) {
        int index = getIndexForKey(key);
        Node<K, V> current = hashtable.get(index);
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public int getIndexForKey(K k) {
        return Math.abs(k.hashCode() % hashtable.size());
    }

    public V hashtabLookup(K k) {
        if (k == null) {
            return null;
        }
        Node<K, V> node = getNodeForKey(k);
        return node == null ? null : node.getValue();
    }

    public void hashtabDelete(K k) {
        Node<K, V> node = getNodeForKey(k);
        if (node == null) {
            return;
        }

        if (node.getPrev() != null) {
            node.getPrev().setNext(node.getNext());
        } else {
            int hashKey = getIndexForKey(k);
            hashtable.set(hashKey, node.getNext());
        }

        if (node.getNext() != null) {
            node.getNext().setPrev(node.getPrev());
        }
    }

    @Override
    public String toString() {
        return hashtable.toString();
    }
}
