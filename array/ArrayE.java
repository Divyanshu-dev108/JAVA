package array;

import java.util.Scanner;

public class ArrayE {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the value at "+i+" index");
            arr[i] = sc.nextInt();
        }

      

        // Logic
        int l = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[l];
                arr[l] = temp;
                l++;
                
            }
            
        }
        // Print
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    


        sc.close();
    }
}
