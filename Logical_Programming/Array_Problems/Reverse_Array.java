package Logical_Programming.Array_Problems;

import java.util.Scanner;

public class Reverse_Array {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Array Values : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Reversed Array");
        for(int j = arr.length-1 ; j>=0;j--){
            System.out.print(arr[j] + " ");
        }

    }
}
