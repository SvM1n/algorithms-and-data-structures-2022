package ru.mirea.practice.task2;

public abstract class AbstractQueue<T> implements Queue<T> {

    //зачем нужен еще один уровень абстракции если классы ArrayQueue и LinkedQueue уже реализуют интерфейс Queue,
    // который содержит в себе все общий части этих двух классов
    public void print() {
        System.out.println(" ");
    }

}
