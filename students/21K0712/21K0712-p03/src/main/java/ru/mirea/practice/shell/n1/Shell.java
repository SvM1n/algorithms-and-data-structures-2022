package ru.mirea.practice.shell.n1;

abstract class Shell {
    public static void main(String[] args) {
        Double a = Double.valueOf(3.3);
        System.out.println(a);
        Double b = Double.parseDouble("2.2");
        System.out.println(b);
        Integer c = a.intValue();
        int d = c;
        System.out.println(d);
        Byte e = a.byteValue();
        byte f = e;
        System.out.println(f);
        Short g = a.shortValue();
        short h = g;
        System.out.println(h);
        Long i = a.longValue();
        long j = i;
        System.out.println(j);
        Float k = a.floatValue();
        float l = k;
        System.out.println(l);
        double m = a;
        System.out.println(m);
        System.out.println(a);
        String n = Double.toString(1.1);
        System.out.println(n);
    }
}
