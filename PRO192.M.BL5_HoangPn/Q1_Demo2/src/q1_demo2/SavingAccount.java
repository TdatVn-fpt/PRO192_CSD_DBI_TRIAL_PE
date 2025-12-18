

package q1_demo2;

public class SavingAccount {
    private String accountID;
    private int balance;

    public SavingAccount(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

   
    public boolean savingWithdraw(int money) {
        if (money > 0 && money < balance) {
            balance -= money;
            return true;
        }
        return false;
    }


    public int savingDeposit(int money) {
        if (money > 0) {
            balance += money;
        }
        return balance;
    }


    public int getMoney() {
        return balance;
    }
}
