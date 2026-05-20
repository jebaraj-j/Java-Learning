package Logical_Programming.Array_Problems;

import java.util.HashSet;
import java.util.Set;

//Set is basically used in where the duplicates are not needed.

public class Remove_Duplicates {
    static void main(String[] args) {
        int[] arr = {1,2,2,4,5,5,6};
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}

