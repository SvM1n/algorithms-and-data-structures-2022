package ru.mirea.practice.n5;

public class DogNursery {
    private Dog[] list = new Dog[1];
    private int counter;

    public void add(Dog d) {
        Dog[] temp = new Dog[counter + 1];
        temp[counter + 1] = d;
        list = temp;
    }

    public DogNursery(Dog[] list) {
        this.list = list;
    }

    public Dog[] getList() {
        return list;
    }

    public void setList(Dog[] list) {
        this.list = list;
    }

}
