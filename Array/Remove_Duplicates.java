package Array;
import java.util.Arrays;

public class Remove_Duplicates {
    static void main(String[] args) {
        int[] a = {1,2,2,3,3,4,4};
        a = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(a));
    }
}
