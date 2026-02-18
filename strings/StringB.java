
package strings;


public class StringB {

    public static void main(String[] args) {
        // using new keyword

        String c = new String("Hello");
        String d = new String("Hello");

        System.err.println(c==d);
        System.err.println(c.equals(d));
    }
    
}
