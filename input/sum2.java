package input;
import java.util.Scanner;

public class sum2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double a = sc.nextDouble();
        System.out.print("Enter anither double value: ");
        double b = sc.nextDouble();

        double sum  = a + b;

        System.out.println("Sum of a and b is = "+sum);
        sc.close();

            
    }

    
    
}
