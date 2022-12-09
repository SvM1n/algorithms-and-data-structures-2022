package ru.mirea.practice.n2to4;

abstract class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        System.out.println(b.toString());
        b.move(1, 4);
        System.out.println("\n After move x+=1 and y+=4 \n" + b.getX());
        System.out.println(b.getY());
        b.setX(2);
        b.setY(5);
        System.out.println("\n After set x=2 and y=5 \n" + b.getX());
        System.out.println(b.getY());
    }
}
