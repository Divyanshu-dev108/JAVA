package input;
import java.util.Scanner;

public class inputchar {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a String ");
        String a = s.nextLine();
    
        

        System.out.print("Enter a Character ");
        char b = s.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);
        s.close();

    }
    
}
