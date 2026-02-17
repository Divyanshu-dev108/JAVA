package array;

import java.util.Scanner;

public class ArrayB {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i =0; i <n; i++){
            System.out.println("Enter the value at "+i+" index.");
            arr[i] = sc.nextInt();
        }

        // print
        System.out.println("Values are: ");

        for(int i =0; i<n; i++){
            System.out.println(arr[i]);
        }
        sc.close();

    }
    
}
