package conditionals;
import java.util.Scanner;

public class ConditionalElseIf {

     public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Marks: ");
        int marks = s.nextInt();
        if(marks > 90){
            System.out.println("A");
        }else if(marks > 80 ){
            System.out.println("B");

        }
        else if(marks > 70 ){
            System.out.println("C");

        }
        else if(marks > 60 ){
            System.out.println("D");

        }
        else{
            System.out.println("E");

        }
        s.close();
    }
   
    
}
