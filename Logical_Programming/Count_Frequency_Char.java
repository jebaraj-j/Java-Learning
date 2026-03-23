package Logical_Programming;
import java.lang.*;
import java.util.HashMap;

public class Count_Frequency_Char {
    static void main(String[] args) {
        String str = "Programming";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : str.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        System.out.println(hm);

    }
}
