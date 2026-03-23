package Array;

public class Find_Largest {
    static void main(String[] args) {
        int[] a ={1,2,3,4,6,10,6};
        int max =a[0];
        for(int i=1;i<=a.length-1;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        System.out.println(max);

    }
}
