package ru.mire.practice.task1;

/* Напишите по диаграмме класс MovableRectangle (движущийся
прямоугольник), реализующий интерфейс Movable, класс прямоугольник,
который можно представить как две движущиеся точки MovablePoint (верхняя
левая и нижняя правая точки – topLeft и bottomRight), также реализующие
интерфейс Movable; */

public interface Movable {

    void moveUp();

    void moveDown();

    void moveLeft();

    void moveRight();

}
