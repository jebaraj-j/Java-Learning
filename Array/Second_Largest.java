package Array;
import java.util.Arrays;

public class Second_Largest {
    static void main(String[] args) {
        int[] a = {5,2,5,6,2,9,10};
        Arrays.sort(a);
        int l = a.length - 2;
        System.out.println(a[l]);
    }
}
