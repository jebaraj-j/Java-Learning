package Logical_Programming.Array_Problems;

import java.util.Arrays;

public class Second_Largest {
    static void main(String[] args) {
        int[] arr = {1,2,4,6,7,7};
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        int s_largest = 0;
        for(int j = arr.length-2; j >=0 ; j--){
            if(arr[j] != largest){
                s_largest = arr[j];
                break;
            }
        }
        System.out.println("Second Largest Value : " + s_largest);
    }
}
