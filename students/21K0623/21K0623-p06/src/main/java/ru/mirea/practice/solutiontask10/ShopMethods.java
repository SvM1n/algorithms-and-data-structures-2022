package ru.mirea.practice.solutiontask10;

public interface ShopMethods {
    void addComputer(Computer pc);

    void removeComputer(Computer pc);

    void removeComputer(int index);

    String findComputer(int numcomputer);

    String findComputer(Computer pc);

    @Override
    String toString();
}
