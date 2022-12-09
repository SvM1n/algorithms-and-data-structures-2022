package practice.part2;

public abstract class Task1to5 {
    public static void main(String[] args) {
        //tasks 1-5
        Integer i1 = 5;
        Double d = Double.valueOf(i1.valueOf(5));
        System.out.println(d);
        String s = "1";
        d = Double.parseDouble(s);
        System.out.println(d);
        byte b = d.byteValue();
        boolean b1 = Boolean.valueOf(String.valueOf(d));
        int b2 = d.intValue();
        short b3 = d.shortValue();
        long b4 = d.longValue();
        double b5 = d.doubleValue();
        System.out.println(b + "" + b1 + " " + b2 + " " + b4 + " " + b5 + " " + b3);
        Double d2 = 5.0;
        System.out.println(d2);
        double l = Double.parseDouble(Double.toString(3.14));
        System.out.println(l);

    }
}


