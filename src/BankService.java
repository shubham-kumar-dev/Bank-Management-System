import java.util.HashMap;

public class BankService {
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private int nextAccountNumber = 1001;
    private Account getAccount(int accountNumber){
        return accounts.get(accountNumber);
    }

    public int createAccount() {

        int accountNumber = nextAccountNumber++;

        Account acc = new Account(accountNumber);
        accounts.put(accountNumber, acc);

        System.out.println("Account created. Number: " + accountNumber);

        return accountNumber;
    }

    public void deposit(int accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);

        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account Not Found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account acc = accounts.get(accountNumber);

        if (acc != null) {
            boolean success = acc.withdraw(amount);
            if (success) {
                System.out.println("Withdraw Successful");
            } else {
                System.out.println("Withdraw Failed!");
            }
        } else {
            System.out.println("Account Not FOUND!");
        }
    }

    public void checkBalance(int accountNumber){
        Account acc = accounts.get(accountNumber);

        if (acc != null) {
            System.out.println("Balance: " + acc.getBalance());
            if (acc.getBalance() <= 0 ){
                System.out.println("Insufficient Balance");
            }
        } else {
            System.out.println("Account not FOUND!");
        }
    }

    // Savings Account
    public int createSavingsAccount(double interestRate) {

        int accountNumber = nextAccountNumber++;

        Account acc = new SavingsAccount(accountNumber, interestRate);
        accounts.put(accountNumber, acc);

        System.out.println("Savings Account created. Number: " + accountNumber);

        return accountNumber;
    }

    // Interest rate calculation!!
    public void addInterest(int accountNumber) {
        Account acc = getAccount(accountNumber);

        if (acc != null) {

            if (acc instanceof SavingsAccount) {
                SavingsAccount savAcc = (SavingsAccount) acc;
                savAcc.addInterest();
                System.out.println("Interest added successfully");
            } else {
                System.out.println("This is not a Savings Account");
            }

        } else {
            System.out.println("Account not found");
        }
    }

    public void transfer(int fromAcc, int toAcc, double amount) {

        if (fromAcc == toAcc) {
            System.out.println("Cannot transfer to same account!");
            return;
        }

        Account sender = getAccount(fromAcc);
        Account receiver = getAccount(toAcc);

        if (sender == null || receiver == null) {
            System.out.println("One or both accounts not found");
            return;
        }

        boolean success = sender.withdraw(amount);

        if (success) {
            receiver.deposit(amount);

            sender.addTransaction("Transferred " + amount + " to Account " + toAcc);
            receiver.addTransaction("Received " + amount + " from Account " + fromAcc);

            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed (rules or insufficient balance)");
        }
    }
    public void showTransactions(int accountNumber) {
        Account acc = getAccount(accountNumber);

        if (acc != null){
            acc.printTransactionHistory();
        } else {
            System.out.println("Account not found!");
        }
    }
}
