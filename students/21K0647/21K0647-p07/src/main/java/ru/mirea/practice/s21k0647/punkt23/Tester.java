package ru.mirea.practice.s21k0647.punkt23;

public final class Tester {
    private Tester() {
        //pust
    }

    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(3, 3,10, 0, 15, 5);
        movableRectangle.moveUp();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
