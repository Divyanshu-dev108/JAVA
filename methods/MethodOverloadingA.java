package methods;

// Method overloading can be done via 
// - no oof parameter 
// - type of parameter
// - ordering of parameter

public class MethodOverloadingA {

    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b  + c;
    }

    public static void main(String[] args){
        int result = sum(2, 3, 12);
        System.out.println("Result is "+ result);
    }
    
}
