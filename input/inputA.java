package input;
import java.util.Scanner;

public class inputA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int a = sc.nextInt();
        
        System.out.print("Enter a float : ");
        float b = sc.nextFloat();

        System.out.print("Enter a double  : ");
        double c = sc.nextDouble();


        System.out.println("Value of a is "+ a);
        System.out.println("Value of b is "+ b);
        System.out.println("Value of c is "+ c);
        sc.close();

    }



    
}