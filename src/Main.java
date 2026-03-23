import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        int choice;

        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Normal Account");
            System.out.println("2. Create Savings Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transfer");
            System.out.println("6. Check Balance");
            System.out.println("7. Transaction History");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bank.createAccount();
                    break;

                case 2:
                    System.out.println("Enter Interest Rate: ");
                    double rate = sc.nextDouble();
                    bank.createSavingsAccount(rate);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int dAcc = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double dAmt = sc.nextDouble();
                    bank.deposit(dAcc, dAmt);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int wAcc = sc.nextInt();
                    System.out.print("Enter Amount: ");
                    double wAmt = sc.nextDouble();
                    bank.withdraw(wAcc, wAmt);
                    break;

                case 5:
                    System.out.print("From Account: ");
                    int from = sc.nextInt();
                    System.out.print("To Account: ");
                    int to = sc.nextInt();
                    System.out.print("Amount: ");
                    double tAmt = sc.nextDouble();
                    bank.transfer(from, to, tAmt);
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    int cAcc = sc.nextInt();
                    bank.checkBalance(cAcc);
                    break;

                case 7:
                    System.out.print("Enter Account Number: ");
                    int hAcc = sc.nextInt();
                    bank.showTransactions(hAcc);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}