package conditionals;

import java.util.Scanner;

public class ConditionalNestedIf {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = s.nextInt();
        boolean isStudent = true;

        if (age > 15){

            if(isStudent == true){
                System.out.println("If - If");
            }else{
                System.out.println("If - Else");
            }

            System.out.println("Hi");
        }
        s.close();

       
    }
    
}
