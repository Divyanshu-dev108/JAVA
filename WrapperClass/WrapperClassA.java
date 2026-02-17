package WrapperClass;



public class WrapperClassA {

    public static void main(String[] args){

        int a = 10;
        
        // Boxing - putting a premitive data type into a class
        Integer b1 = new Integer(a); // it will work fine but for some cases or for further version this can be deleted.
        Integer b2 = Integer.valueOf(a); // safe to use and it wont be deleted.

        //Autoboxing - Easier and Efficient does the same this as boxing 
        Integer b3 = a;

        // Print
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //Unboxing  -- taking out a data type from the class.

        int c1 = b2.intValue();

        int c2 = b3;


        // Print
        System.out.println(c1);
        System.out.println(c2);

    }
    
}
