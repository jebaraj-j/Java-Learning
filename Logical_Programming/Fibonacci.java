package Logical_Programming;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0, n2=1;
        int res = 0;
        int N =10;
        for(int i=0;i<=N;i++){
            System.out.print(n1+" ");
            res = n1+n2;
            n1 = n2;
            n2 = res;
        }
    }
}
