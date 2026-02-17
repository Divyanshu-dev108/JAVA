// this refers to the current object
// It means this refer to the object which it getting called

package thisKeyword;

public class ClassA {

    int id;
    int marks;

    // Constructor 
    ClassA(int id, int marks){
        this.id = id;
        this.marks = marks;
    }
    public static void main(String[] args) {

        ClassA obj = new ClassA(2, 80);
        System.out.println(obj.id+"\n"+obj.marks);

        
    }
}
