package OOP.Encapsulation;

public class Bank {
    private int balance;
    private int deposit;
    private int withdrawl;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount){
        this.balance = this.balance - amount;
        System.out.println("Balance: "+ balance);
    }

    public int getDeposit(){
        return deposit;
    }

    public void setDeposit(int amount){
        this.balance = balance + amount;
        System.out.println("Deposited: "+ amount);
    }

    public int getWithdrawl() {
        return withdrawl;
    }

    public void setWithdrawl(int withdrawl) {
        this.withdrawl = withdrawl;
        System.out.println("Withdrawed: "+ withdrawl);
    }
}
