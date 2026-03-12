package OOP.Encapsulation;

public class User_Account {
    static void main(String[] args) {
        Bank bank = new Bank();
        bank.setDeposit(2000);
        System.out.println(bank.getBalance());
        bank.setWithdrawl(500);
        System.out.println(bank.getBalance());

    }
}
