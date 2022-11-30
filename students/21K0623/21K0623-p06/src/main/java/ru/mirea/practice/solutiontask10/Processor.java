package ru.mirea.practice.solutiontask10;

public class Processor {
    private final NameComputers name;
    private final double frequency;
    private final int countcore;

    public Processor(NameComputers name, double frequency, int countcore) {
        this.name = name;
        this.frequency = frequency;
        this.countcore = countcore;
    }

    @Override
    public String toString() {
        return "Процессор бренда: " + name + "\nЧастатой: " + frequency + " Кол-во ядер: " + countcore;
    }
}
