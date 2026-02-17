package WrapperClass;

public class WrapperClassB {
    public static void main(String[] args){

        boolean a = true;
        
        // Boxing - putting a premitive data type into a class
        Boolean b1 = new Boolean(a); // it will work fine but for some cases or for further version this can be deleted.
        Boolean b2 = Boolean.valueOf(a); // safe to use and it wont be deleted.

        //Autoboxing - Easier and Efficient does the same this as boxing 
        Boolean b3 = a;

        // Print
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        //Unboxing  -- taking out a data type from the class.

        boolean c1 = b2.booleanValue();

        boolean  c2 = b3;


        // Print
        System.out.println(c1);
        System.out.println(c2);
        

    }
    
}
