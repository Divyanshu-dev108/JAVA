package strings;

// Different Constructor of string.
public class StringD {
    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println(s1);

        String s2 = new String("Hi");
        System.err.println(s2);

        String s3  = " Hello Class";
        String s4 = new String(s3);
        System.out.println(s4);

        byte[] arr = {65, 66, 67, 68};
        String s5 = new String(arr);
        System.out.println(s5);

        char[] arr2 = {'a', 'b', 'c'};
        String s6 = new String(arr2);
        System.err.println(s6);
        
    }
    
}
