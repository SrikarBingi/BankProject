package BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("SB12345", "Srikar Bingi", 5000);

        account.displayAccountDetails();
        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(6000); // Insufficient balance test
        account.deposit(-100);  // Invalid deposit test
    }
}
