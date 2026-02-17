package array;

import java.util.Scanner;

public class ArrayD {
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

        int temp = arr[0];
        for(int i = 0; i < n -1; i++){
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }



        sc.close();

    }
}
