package forloops;
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // To print - 1 1 1 1 
        //            2 2 2 2 
        //            3 3 3 3 
        //            4 4 4 4 
        System.out.println("Enter the Value of n : ");
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= n; j++ ){
                System.out.print(i + " ");

            }
            System.out.println();

        }

        System.out.println("-----------------------------------");

        // TO print - 1 2 3 4
        //            1 2 3 4
        //            1 2 3 4
        //            1 2 3 4

        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= n; j++ ){
                System.out.print(j + " ");

            }
            System.out.println();

        }


        System.out.println("-----------------------------------");

        // TO print - 1 
        //            2 2 
        //            3 3 3 
        //            4 4 4 4


        for(int i = 1; i<=n; i++){
            for(int j = 1; j <=  i; j++ ){
                System.out.print(i + " ");

            }
            System.out.println();

        }

        System.out.println("-----------------------------------");

        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        s.close();


    }

}
