package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Check_Sorted_Array {
    static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        int[] b = Arrays.copyOf(a,a.length);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if (Arrays.equals(a,b)){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }

    }
}
