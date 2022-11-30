package ru.mirea.practice.s21k0709.task3;

public class Earth implements Nameable {
    private String name;
    private double speed;
    private double g;

    public Earth(String name, double speed, double g) {
        this.name = name;
        this.speed = speed;
        this.g = g;
    }

    public Earth() {
        //
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getG() {
        return g;
    }

    public void setG(double g) {
        this.g = g;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Earth{"
                +
                "name='" + name + '\''
                +
                ", speed=" + speed
                +
                ", g=" + g
                +
                '}';
    }
}
