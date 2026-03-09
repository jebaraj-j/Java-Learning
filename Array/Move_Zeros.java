package Array;

import java.util.Arrays;

public class Move_Zeros {
    static void main(String[] args) {
        int a[] = {1,2,5,0,0,9,7};
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] == 0){
                count++;
            }
        }
        int newarr[] = new int[a.length];
        Arrays.fill(newarr,0);
        int j =0;
        for(int num : a){
            if(num != 0){
                newarr[j++] = num;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
