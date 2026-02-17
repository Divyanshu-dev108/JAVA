package array;

import java.util.Scanner;

public class ArrayC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the value at "+i+" index");
            arr[i] = sc.nextInt();
        }
        // logic

        int l = 0;
        int r = (n - 1);

        //Swap
        while (l<r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
            
        }

        // print
        for(int i = 0; i < n; i++){
            System.out.print(" "+arr[i]);

        }
        sc.close();
    }
}
