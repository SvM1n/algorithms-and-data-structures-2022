package mirea.practice.task2;

public abstract class Main {
    public static void main(String[] args) {
        HuffmansAlgorithm algorithm = new HuffmansAlgorithm("abracadabra");
        System.out.println(algorithm.getTree());
        System.out.println(algorithm.getFrequencyDictionary());
    }
}
