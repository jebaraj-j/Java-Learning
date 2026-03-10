package OOP;

public class BankAccount {
    private float balance;
    private int accno;

    public float getBalance(){  //Getter Function
        return balance;
    }

    public void setBalance(float balance){  //Setter Function

        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }
}

