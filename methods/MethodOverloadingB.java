package methods;

public class MethodOverloadingB {

    public static int sum(int a, int b){
        System.out.println("A");
        return a + b;
    }
    public static double sum(double a, double b){
        System.out.println("B");
        return a + b;
    }

    public static void main(String[] args) {

        double result = sum(2, 3);
        System.out.println("Result is "+ result);
        
    }
    
}
