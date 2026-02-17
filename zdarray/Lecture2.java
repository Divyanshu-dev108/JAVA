package zdarray;
import java.util.Scanner;

public class Lecture2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();   // rows
        int m = sc.nextInt();   // columns

        // Original matrix (n x m)
        boolean[][] arr = new boolean[n][m];

        // Input elements
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print("Enter value at " + i + " , " + j + " : ");
                arr[i][j] = sc.nextBoolean();
            }
        }

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose matrix (m x n)
        boolean[][] transpose = new boolean[m][n];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print transpose
        System.out.println("\nTranspose Matrix:");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
