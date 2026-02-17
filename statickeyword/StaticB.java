// We can not access a non-Static variable inside a static function 
package statickeyword;

public class StaticB {

    int a = 10;
    static int b = 20;
    public static void main(String[] args) {

        // System.out.println(a); --> ERROR
        System.out.println(b);
        
    }
    
}
