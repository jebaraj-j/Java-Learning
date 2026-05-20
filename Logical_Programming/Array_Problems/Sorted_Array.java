package Logical_Programming.Array_Problems;

public class Sorted_Array {
    static void main(String[] args) {
        int[] arr= {1,13,2,4,5};
        boolean flag = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){

            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Sorted!");
        }
        else{
            System.out.println("Not Sorted!");
        }

    }
}
