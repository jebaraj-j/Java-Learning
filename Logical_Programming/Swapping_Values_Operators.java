package Logical_Programming;

public class Swapping_Values_Operators {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        a = a+b; // a=30
        b = a-b; // b=10
        a = a-b; // a=20

        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }
}
