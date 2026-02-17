package conditionals;
import java.util.Scanner;

public class ConditionalIfElse {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = s.nextInt();
        if(age > 10){
            System.out.println("Inside If ");
        }else{
            System.out.println("Inside else ");
        }
        s.close();
    }
}
