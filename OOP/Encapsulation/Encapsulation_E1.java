package OOP.Encapsulation;

public class Encapsulation_E1 {
    static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setBalance(10000);  //Set Balance
        System.out.println(obj.getBalance()); //Get Balance
    }
}
