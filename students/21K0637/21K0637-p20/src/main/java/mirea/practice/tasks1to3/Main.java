package mirea.practice.tasks1to3;

public abstract class Main {
    public static void main(String[] args) {
        GeneralClass<String, Dog, Number> generalClass = new GeneralClass<>("Mirea",
            new Dog("Dog"), 45);

        System.out.println(generalClass.getTypes());
    }

}
