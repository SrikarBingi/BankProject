package BankAccount;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    //constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    //Deposit method
    public void deposit(double amount){
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". New Balance: ₹" + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero!");
        }
    }

    //withdraw method
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else if(amount > balance){
            System.out.println("Insufficient balance!");
        } else{
            System.out.println("Withdrawal amount must be greater than zero!");
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}
