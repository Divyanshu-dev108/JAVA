package TypeConversion;

public class ImplicitTypeCasting {

    public static void main(String[] args) {
        byte a = 5;

        // Implicit Type Casting

        short b1 = a;
        int b2 = a;
        long b3 = a;
        float b4 = a;
        double b5 = a;

        System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5);

        // Implicit Type Casting of float

        float b = 2.5f;
        double c1 = b;
        System.err.println(c1);

        // Implicit Type Casting of character

        char ch = 'A';
        int d1 = ch;
        long d2 = ch;
        float d3 = ch;
        double d4 = ch;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);



    }
    
}
