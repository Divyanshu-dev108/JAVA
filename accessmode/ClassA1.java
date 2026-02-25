package accessmode;

public class ClassA1 {

    private int a = 5; // private 
    int b = 10;  // default 
    public int c = 3; // public 

    private void Display(){
        System.out.println("Hello");
    }
    public void greet(){
        Display();
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        ClassA1 obj = new ClassA1();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
    
}
