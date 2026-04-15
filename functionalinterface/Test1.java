// Function Interface - containing only one abstract method 

package functionalinterface;


@FunctionalInterface
interface Animal{
    void eat();
    
}

public class Test1 {

    public static void main(String[] args) {
        // Animal obj = new Animal() {
        //     public void eat(){
        //         System.out.println("Eating");
        //     }
        // };

        // obj.eat();

        Animal obj = () -> {
            System.out.println("Eating");
        };
        obj.eat();
    }
    
}
