package Array;
import java.util.Arrays;

public class Reverse_Arr {
    static void main(String[] args) {
        int[] a = {1,9,7,6,4};


//        for(int i: a){ //Int Traverse
//            System.out.println(i);
//        }
        int left = 0;
        int right = a.length-1;
        while(left<right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(a));




        System.out.println(Arrays.toString(a));

    }
}
