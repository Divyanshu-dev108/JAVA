
// final method cannot be overriden.
// final classes cannot be inherited/extwnded.
package finalkeyword;

class x1{
    final void greet(){
        System.out.println("Hello");
    }
}
class x2 extends  x1{
    // void greet(){
    //     System.out.println("Hello");
    // } --> not possible 
}
public class Test2 {
    public static void main(String[] args) {
        x2 obj = new x2();
        obj.greet();
    }
}
