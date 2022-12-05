package ru.mirea.practice.task6;

import java.util.Objects;

public class Circle {
    Circle() {
        x = 0;
        y = 0;
        r = 0;
    }

    Circle(float x, float y, float r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getArea() {
        return pi * r * r;
    }

    public float getLength() {
        return 2 * pi * r;
    }

    public boolean largerThan(Circle other) {
        return this.r > other.r;
    }

    public boolean smallerThan(Circle other) {
        return this.r < other.r;
    }

    @Override public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Circle cr = (Circle)obj;
        return this.r == cr.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, r, pi);
    }

    private float x;
    private float y;
    private float r;
    public static final float pi = 3.14159265f;
}
