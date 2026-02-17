
package classandobject;

public class Student {
    int id;
    String name;
    int marks;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 2;
        s1.name  = "Raj";
        s1.marks = 80;
        System.out.println(s1.id+" "+s1.name+" "+s1.marks);


        Student s2 = new Student();
        s2.id = 3;
        s2.name  = "Rohan";
        s2.marks = 83;
        System.out.println(s2.id+" "+s2.name+" "+s2.marks);
    }
    
}
