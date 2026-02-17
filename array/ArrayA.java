package array;

import java.util.Scanner;

public class ArrayA {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // one way to declear an array.
        int[] arr = new int[5];

        // value assign.
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;

        // another way to get value
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i =0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println(arr1[1]);

        // other way to declare an array

        int[] arr2 = new int[]{2, 4, 6, 8, 10};
        System.out.println(arr2[2]);

        int[] arr3 ={2, 4, 6, 8, 10};
        System.out.println(arr3[2]);

        for(int i = 0; i <= n; i++){
            System.out.println(arr1[i]);
        }
        sc.close();


    }
    
}
