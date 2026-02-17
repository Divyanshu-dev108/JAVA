// Here this is getting used to call another constructor from the constructor.
package thisKeyword;

public class ClassB {

    int id;
    int marks;

    ClassB(){
        this(2, 80);
        System.out.println("A");
    }

    ClassB(int a, int b){
        System.out.println("B");
        id = a;
        marks = b;
    }

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        System.out.println(obj.id+"\n"+obj.marks);
    }
    
}
