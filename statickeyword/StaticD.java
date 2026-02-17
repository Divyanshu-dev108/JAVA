// From a static function, if we calling a non-static function 
// we have to create an obj first.
package statickeyword;

public class StaticD {

    public void greet(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        StaticD obj = new StaticD();
        obj.greet();
        
    }
}
