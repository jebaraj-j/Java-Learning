package Patterns;

public class Left_Half_Pyramid_Inverted_Star {
    static void main(String[] args) {
        for (int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
