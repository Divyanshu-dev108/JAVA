package input;
import java.util.Scanner;


public class floatIn {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Float value of p: ");
        float p = sc.nextFloat();
        System.out.print("Enter Float value of r: ");
        float r = sc.nextFloat();
        System.out.print("Enter Float value of t: ");
        float t = sc.nextFloat();

        float si = (p*r*t) / 100;

        System.out.println("SI is " + si);
        sc.close();
    }

}
