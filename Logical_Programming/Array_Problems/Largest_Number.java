package Logical_Programming.Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Largest_Number {
    static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the Number of Values : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
           arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int largest_Value = arr[arr.length-1];
        System.out.println("Largest Value : " + largest_Value);

    }
}
