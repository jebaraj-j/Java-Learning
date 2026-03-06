public class TwoD_Arr {
    static void main(String[] args) {
        int[][] a = new int[3][2];
        a[0][1] = 40;
        a[1][0] = 60;
        a[2][0] = 80;

        for(int i =0;i<3;i++){
            for(int j = 0;j<2;j++){
                System.out.print(a[i][j] * 5);
            }
            System.out.println();
        }
     }
}
