package TypeConversion;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        // double -> float -> long -> int -> char -> short -> byte

        double a = 9.576;

        float d1 = (float)a;
        int d2 = (int)a;

        System.out.println(d1);
        System.out.println(d2);

        long c = 2345l;
        int c1 = (int)c;

        System.out.println(c1);

    }
    
}
