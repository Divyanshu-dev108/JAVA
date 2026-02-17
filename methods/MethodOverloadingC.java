package methods;

public class MethodOverloadingC {

    public static void Display(int a, boolean b){
        System.out.println("Inside first");
    }
    public static void Display(boolean a, int  b){
        System.out.println("Inside Second");
    }


    public static void main(String[] args) {
        Display(false, 2);
    }
    
}
