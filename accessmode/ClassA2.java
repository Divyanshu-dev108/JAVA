package accessmode;

public class ClassA2 {
    public static void main(String[] args) {
        ClassA1 obj = new ClassA1();

        // System.out.println(obj.a); you can not print it because a ia a private 
        System.out.println(obj.b);
        System.out.println(obj.c);
        obj.greet();
        
    }
    
}
