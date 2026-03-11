package Logical_Programming;

public class Armstrong_Number {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
