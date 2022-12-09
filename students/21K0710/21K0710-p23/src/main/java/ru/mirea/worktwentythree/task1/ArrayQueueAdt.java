package ru.mirea.worktwentythree.task1;

public class ArrayQueueAdt {
    int size = 5;
    int[] items = new int[size];
    int front;
    int rear;

    ArrayQueueAdt() {
        front = -1;
        rear = -1;
    }

    public static void main(String[] args) {
        ArrayQueueAdt q = new ArrayQueueAdt();
        q.deQueue(q);
        for (int i = 1; i < 6; i++) {
            q.enQueue(q, i);
        }
        q.enQueue(q, 6);
        q.display(q);
        q.deQueue(q);
        q.display(q);
    }

    boolean isFull(ArrayQueueAdt adt) {
        return adt.front == 0
                && adt.rear == adt.size - 1;
    }

    boolean isEmpty(ArrayQueueAdt adt) {
        return adt.front == -1;
    }

    void enQueue(ArrayQueueAdt adt, int element) {
        if (isFull(adt)) {
            System.out.println("Queue is full");
        } else {
            if (adt.front == -1) {
                adt.front = 0;
            }
            adt.rear++;
            adt.items[adt.rear] = element;
            System.out.println("Insert " + element);
        }
    }

    int deQueue(ArrayQueueAdt adt) {
        int element;
        if (isEmpty(adt)) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = adt.items[adt.front];
            if (adt.front >= adt.rear) {
                adt.front = -1;
                adt.rear = -1;
            } else {
                adt.front++;
            }
            System.out.println(element + " Deleted");
            return element;
        }
    }

    void display(ArrayQueueAdt adt) {
        int i;
        if (isEmpty(adt)) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.print("Items -> ");
            for (i = adt.front; i <= adt.rear; i++) {
                System.out.print(adt.items[i] + " ");
            }
            System.out.println("\nRear index-> " + adt.rear);
        }
    }
}
