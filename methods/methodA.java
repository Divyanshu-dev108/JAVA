package methods;

public class methodA {

    public static void greet(){
        System.out.println("Hello there");
    }
    public static void Display() {
        System.out.println("Inside Display");
        greet();
        System.out.println("Exiting Display");
    }

    public static void main(String[] args) {
        System.out.println("Hi");
        Display(); // calling a function directly.
        System.out.println("Bye");
    }
}
