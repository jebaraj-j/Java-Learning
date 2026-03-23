package Advance_Java;
import java.util.ArrayList;

public class Arraylist {
    static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(100);

        arr.remove(0);
        arr.add(200);
        arr.add(30);
        ArrayList <Integer> arr1 = new ArrayList<Integer>();
        arr1.addAll(arr);
        arr.stream().forEach(x-> System.out.println(x));
        arr.stream().map(x-> x*2).forEach(x-> System.out.println(x));
    }
}
