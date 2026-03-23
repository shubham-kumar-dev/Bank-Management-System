public class SavingsAccount extends Account{

    private double interestRate;
    public SavingsAccount(int accountNumber, double interestRate){
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        double interest = getBalance() * interestRate/100;
        deposit(interest);
    }

    @Override
    public boolean withdraw(double amount){
        if (amount > 0 && (getBalance() - amount) >= 1000){
            return super.withdraw(amount);
        }
        return false;
    }
}