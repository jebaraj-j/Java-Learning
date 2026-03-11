package Patterns;

public class Pattern24 {
    static void main(String[] args) {
        for(int i=1;i<=5;i++){

            for (int j = 1; j <= 5; j++) {
                if(j%2 == 1){
                    System.out.print(0 + " ");
                }
                else{
                    System.out.print(1 + " ");
                }
            }

            System.out.println();
        }
    }
}
