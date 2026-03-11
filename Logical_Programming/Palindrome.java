package Logical_Programming;

public class Palindrome {
    public static void main(String[] args) {
        int num = 134143321;
        int rev = 0;
        int temp = num;

        while(temp != 0){
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(num == rev){
            System.out.println(num +" is a palindrome number");
        }else{
            System.out.println(num+ " is not a palindrome number");
        }
    }
}
