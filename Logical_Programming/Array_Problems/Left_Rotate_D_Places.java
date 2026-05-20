package Logical_Programming.Array_Problems;


import java.util.Arrays;

public class Left_Rotate_D_Places {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int d = 15;
        d = d % arr.length;
        int[] temp = Arrays.copyOf(arr,d);
        for(int j = 0 ; j< (arr.length-d);j++){
            arr[j] = arr[j+d];
        }
        for(int i = 0 ;i<d;i++){
            arr[arr.length-d+i] = temp[i];
        }
        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}
