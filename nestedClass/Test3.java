
// Local class - a class inside a method


package nestedClass;

class Outer2 {
    int x = 10;

    void show(){

        class Local {
            void display(){
                System.out.println("Inside a local class");
                System.out.println("Value of x is "+x);
            }
        }

        Local obj = new Local();
        obj.display();


    }
}

public class Test3 {
    public static void main(String[] args) {
        Outer2 obj = new Outer2();
        obj.show();
    }
    
}
