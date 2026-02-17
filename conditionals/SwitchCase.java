package conditionals;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number From 1 - 5");
        int a = s.nextInt();

        switch(a){
            case 1:
                System.out.println("CASE 1");
            break;

            case 2:
                System.out.println("CASE 2");
            break;

            case 3:
                System.out.println("CASE 3");
            break;

            case 4:
                System.out.println("CASE 4");
            break;

            case 5:
                System.out.println("CASE 5");
            break;

            default:
                System.out.println("Wrong Number");
            break;


        }
        s.close();

    }
    
}
