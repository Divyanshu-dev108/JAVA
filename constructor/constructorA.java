
// A constructor will have same name as class name.
// A constructor does not have any return type.
// A constructor is generally used to assign values.
// A constructor is called at the time of object creation by compiler.
// You cannot call a constructor.

package constructor;

class Student{
    String name;
    int id;
    // Constructor
    Student(){
        System.out.println("Constructor is called");
    }

    void study(){
        System.out.println("Studying");
    }
}

public class constructorA {
    public static void main(String[] args) {
        Student s1 = new Student(); // constructor will be called 
        s1.study(); // function call

    }
    
}
