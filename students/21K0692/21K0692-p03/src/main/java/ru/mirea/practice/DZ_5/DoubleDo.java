package DZ_5;

public class DoubleDo {
    public static void main(String[] args)
    {
        double a = 46.23;
        String b = "823455";
        int c = 234;
        byte d = 34;
        Double x = Double.valueOf(a);
        System.out.println("valueOf(a) = " + x);
        x = Double.valueOf(b);
        System.out.println("ValueOf(b) = " + x);
        x = Double.valueOf(c);
        System.out.println("ValueOf(c) = " + x);
        x = Double.valueOf(d);
        System.out.println("ValueOf(d) = " + x);

        Double y = Double.parseDouble(b);
        System.out.println("parseDouble(b) = " + y);

        Double z = new Double(a);
        System.out.println("bytevalue(obj) = " + z.byteValue());
        System.out.println("intvalue(obj) = " + z.intValue());
        System.out.println("doublevalue(obj) = " + z.doubleValue());
        System.out.println("longvalue(obj) = " + z.longValue());


        String s = Double.toString(3.14);



    }
}
