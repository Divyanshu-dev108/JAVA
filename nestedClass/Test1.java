
// Static Nested class - a static class inside a class
package nestedClass;

class Outer {
    int data1 = 100;
    static int data2 = 200;

    static void greet(){
        System.out.println("Greeting...");
    }

    static class Nested {
        void display(){
            System.out.println("Inside static nested class");
            System.out.println(data2);
            greet();
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Outer.Nested obj = new Outer.Nested();
        obj.display();
    }
    
}
