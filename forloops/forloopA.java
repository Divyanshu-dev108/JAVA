package forloops;

import java.util.Scanner;

public class forloopA {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value of n : ");
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <= n; j++ ){
                if(i == (n/2)+1 || j == (n/2)+1){
                    System.out.print("@ ");
                }
                else
                    System.out.print("* ");

            }
            System.out.println();

        }
        s.close();
    }
    
}
