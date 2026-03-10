package Patterns;

public class Square_Sequance_Odd_Number {
    static void main(String[] args) {
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(count + " ");
                count = count+2;
            }
            System.out.println();
        }
    }
}
