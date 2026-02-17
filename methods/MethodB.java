package methods;
import java.util.Scanner;

public class MethodB {

    public int addTwoNumbers(int a, int b){
        return a + b;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbe to add");
        int a = sc.nextInt();
        int b = sc.nextInt();
        MethodB obj = new MethodB();
        int result = obj.addTwoNumbers(a, b);
        System.out.println("Result is "+ result);
        
    }
    
    
    
    
}
