package Patterns;

public class Pattern30 {
    static void main(String[] args) {
        char letter = 'A';
        for(int i=1;i <= 5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(letter++ + " ");
            }
            System.out.println();
        }
    }
}
