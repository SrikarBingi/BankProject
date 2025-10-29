package Account;

public class FixedDepositAccount extends Account{
    private double rate;
    private int lockInPeriod;

    public FixedDepositAccount(String accountNumber, String accountHolderName, double balance, double rate,
            int lockInPeriod) {
        super(accountNumber, accountHolderName, balance);
        this.rate = rate;
        this.lockInPeriod = lockInPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    public double calculateMaturityAmount() {
        double balance = super.getBalance();
        return balance + (balance * rate * lockInPeriod / 100);
    }
}
