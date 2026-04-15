package byfferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {
    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);

            System.out.print("Enter Int: ");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Int is "+age);

            System.out.print("Enter Long: ");
            long population = Long.parseLong(br.readLine());
            System.out.println("Long is "+ population);


            System.out.print("Enter Char: ");
            char grade = br.readLine().charAt(0);
            System.out.println("Grade  "+ grade);




        } catch (IOException | NumberFormatException e) {
            System.out.println("Error "+ e.getMessage());

        }
    }
}
