package ru.mirea.practice.task4;

class Program4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double p =sc.nextDouble();
            double sum =0;
            int[] a = new int[10];
            for (int n =0 ; n<10; n++){
                a[n] = n+1;
                sum+=1/(Math.pow(a[n], p));

            }
            System.out.println(sum);
        }
    }
}
