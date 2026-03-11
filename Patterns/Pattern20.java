package Patterns;

public class Pattern20 {
    static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i%2 == 1 ) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print((i + j+1) % 2 + " ");
                }
            }
            else{
                for (int j = 1; j <= 5; j++) {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
