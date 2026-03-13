
// Inner class (NOn-Static Nested Class)

package nestedClass;


class Outer1 {
    private int data1 = 100;
    int data2 = 200;
    static int data3 = 300;

    
    void display(){
        System.out.println("Outer method");
        
            
    }

    class Inner1 {
        void show(){
            System.out.println("Printing");
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            display();
        }
    }
    
}
public class Test2 {
    public static void main(String[] args) {
        Outer1 outer = new Outer1();
        Outer1.Inner1 inner = outer.new Inner1();
        inner.show();
    }
    
}
