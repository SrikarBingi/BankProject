package Account;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void displayAccountType() {
        System.out.println("This is a Current Account");
    }

    public void useOverdraft(double amount) {
        double balance = super.getBalance();
        if (amount <= overdraftLimit) {
            balance -= amount;
            System.out.println("Used overdraft: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }
}
