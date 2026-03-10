package Patterns;

public class Pattern44 {
    static void main(String[] args) {
        int count =2;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count + " ");
                count = count +2;
            }
            System.out.println();
        }
    }
}
