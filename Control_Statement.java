public class Control_Statement {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for(int j =5;j>=1;j--){
        //         if(j<=i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
            
        // }

        int num =143;
        int sum =0;
        
        while(num !=0){
            int rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        System.out.println(sum);
    }
}
