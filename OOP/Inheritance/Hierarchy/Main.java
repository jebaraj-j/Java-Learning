package OOP.Inheritance.Hierarchy;

class Bank {
    int balance =1000;

    void deposit (int amount){
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void checkBalance(){
        System.out.println("Balance: " + balance);
    }

}

class Savings extends Bank{
    void withdraw(int amount){
        if(amount<=balance){
            balance = balance - amount;
            System.out.println("Withdrawed from savings: " + amount);
        }else{
            System.out.println("Insufficient Balance!");
        }
    }
}

class Current extends Bank{
    void withdraw(int amount){
        if(amount<=balance){
            balance = balance - amount;
            System.out.println("Withdrawed from current: " + amount);
        }else{
            System.out.println("Insufficient Balance!");
        }
    }
}

public class Main{
    static void main(String[] args) {
        Savings s = new Savings();
        s.deposit(500);
        s.checkBalance();
        s.withdraw(100);
    }
}
