import java.util.ArrayList;

public class Account{
    public int accountNumber;
    private double balance;
    private ArrayList<String> transactions = new ArrayList<>();

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public boolean deposit(double amount){
        if (amount > 0){
            balance += amount;
            transactions.add("Deposited: " + amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            transactions.add("Withdrawn: " + amount);
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void printTransactionHistory(){
        for (String t : transactions){
            System.out.println(t);
        }
    }

    protected void addTransaction(String message) {
        transactions.add(message);
    }
}