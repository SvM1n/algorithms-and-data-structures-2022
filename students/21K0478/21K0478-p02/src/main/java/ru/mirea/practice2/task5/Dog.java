package ru.mirea.practice2.task5;

public class Dog {
    private String dogName;
    private Integer dogAge;

    public Dog(String dogName, Integer dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public Dog() {
        this.dogAge = 0;
        this.dogName = "None";
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogname) {
        this.dogName = dogname;
    }

    public Integer getDogAge() {
        return dogAge;
    }

    public void setDogAge(Integer dogAge) {
        this.dogAge = dogAge;
    }

    public Integer countHumanAge(Integer dogage) {
        this.dogAge = dogage;

        return dogage * 7;
    }

    @Override
    public String toString() {
        return "Dog{" + "dog_name='" + dogName + '\'' + ", dog_age=" + dogAge + '}';
    }
}
