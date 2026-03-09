package Array;

public class Sum_of_Elements {
    static void main(String[] args) {
        int target = 150;
        int[] a = {100,20,120,50,10};
        for(int i =0;i<a.length-1;i++){
            for(int j = i;j<a.length-1;j++){
                if(a[i]+a[j]==150){
                    System.out.println("The Indices Are "+ i + " and "+ j);
                }
            }
        }
    }
}
