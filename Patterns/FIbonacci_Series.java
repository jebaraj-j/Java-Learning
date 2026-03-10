package Patterns;

public class FIbonacci_Series {

    public static void main(String[] args) {

        int i = 0, j = 1;
        int temp;

        for(int a = 1; a <= 20; a++){

            System.out.print(i + " ");

            temp = i + j;
            i = j;
            j = temp;

        }
    }
}