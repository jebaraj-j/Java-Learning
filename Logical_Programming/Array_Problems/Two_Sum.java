package Logical_Programming.Array_Problems;

import java.util.HashMap;

public class Two_Sum {
    static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
//        Brute-Force
//        for(int i = 0 ; i< arr.length;i++){
//            for(int j = i+1;j<arr.length;j++){
//                if(arr[i] + arr[j] == target){
//                    System.out.println("Indices are : " + i + ", " + j);
//                }
//            }
//        }

//        Better Using HashMap
        // HashMap is used in situations like where the numbers should easily identify.
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0;i<arr.length;i++){
            int current = arr[i];
            int needed = target - current;
            if (map.containsKey(needed)){
                System.out.println("Indices are : "+ map.get(needed)+ " " + i);
            }
            map.put(current,i);
        }
    }
}
