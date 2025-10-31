package Account;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void displayAccountType(){
        System.out.println("Savings Account");
    }

    public void addInterest() {
        double balance = super.getBalance();
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
    
}
