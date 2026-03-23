package Logical_Programming;

public class Reverse_String {
    static void main(String[] args) {
        String a = "Java";
        String b = "";
        for(int i = a.length()-1;i >= 0 ; i--){
            b += a.charAt(i);
        }
        System.out.println(b);
    }
}
