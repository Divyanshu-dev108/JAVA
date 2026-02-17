// Here this is getting used to return the current object.
package thisKeyword;

public class ClassC {

    int id;
    int marks;

    ClassC(int a, int b){
        id = a;
        marks = b;
    }
    // Method 
    ClassC get(){
        return this;
    }

    public void display(){
        System.out.println("Id is "+ id);
        System.out.println("Marks is  "+ marks);
    }
    public static void main(String[] args) {

        ClassC obj = new ClassC(2, 80);
        obj.get().display(); // we call this method chaining.


        // obj.get() -> obj.


        
    }
    
}
