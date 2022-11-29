package mirea.practice.task5;

public abstract class Main {
    public static void main(String[] args) {
        Matrix<Integer> a = new Matrix<>(new Integer[][]{
            {18,28,18},
            {28,45,12},
            {45,3,14}});
        Matrix<Integer> b = new Matrix<>(new Integer[][]{
            {43,2,4},
            {14,8,11},
            {25,3,23}});

        a.addTo(b);
        System.out.println(a);
        a.multiplyTo(2);
        System.out.println(a);
    }
}
