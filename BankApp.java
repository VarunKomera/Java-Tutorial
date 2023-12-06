import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private int accountNumber;
    private int balance;

    public BankAccount(String accountHolderName, int accountNumber, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();

        BankAccount account = new BankAccount(name, accountNumber, initialBalance);

        System.out.print("Enter the amount to deposit: ");
        int depositAmount = scanner.nextInt();
        account.deposit(depositAmount);

        System.out.print("Enter the amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();
        account.withdraw(withdrawAmount);

        int balance = account.getBalance();
        String status = (balance >= 5000) ? "Minimum Balance Maintained" : "Minimum Balance not Maintained";

        System.out.println("Current balance: " + balance);
        System.out.println("Status: " + status);

        
    }
}
