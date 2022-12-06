package ru.mirea.practice.task2;

/* По UML диаграмме класса написать программу,
 которая состоит из двух классов. Один из них Ball должен
 реализовывать сущность мяч, а другой с названием TestBall тестировать работу
 созданного класса. Класс Ball должен содержать реализацию методов,
 представленных на UML. Диаграмма на рисунке описывает сущность Мяч
 написать программу. Класс Ball моделирует движущийся мяч.*/

public final class TestBall {
    private TestBall() {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {

        Ball testBall = new Ball(1.0, 3.0);
        System.out.println("Ball: " + testBall);

        testBall.move(4.0, -2.5);
        System.out.printf("Ball's new coordinates: %s,%s%n", testBall.getX(), testBall.getY());

    }
}
