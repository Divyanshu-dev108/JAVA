package zdarray;
import java.util.Scanner;

public class Lecture1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Method 1 to DECLARE A 2D ARRAY
        int[][] arr = new int[3][3];


        //Method 2 for declaration
        int m = sc.nextInt();
        int[][] arr2 = new int[m][m];
        
        for(int i = 0 ; i<m ;i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                System.out.println("Enter value at "+i+"th , "+j+"th index : ");
                arr2[i][j] = sc.nextInt();
            }
        }
        //PRINT
        for(int i = 0 ; i<m ;i++)
        {
            for(int j = 0 ; j<m ; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}