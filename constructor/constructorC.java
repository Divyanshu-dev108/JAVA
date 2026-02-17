package constructor;

class Student{
    int id;
    String name;

    // Non - parameterizes constructor - which does not accept parameter

    Student(){
        System.out.println("Student constructor is called");
    }
}


public class constructorC {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
    
}
