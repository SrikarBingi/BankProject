package Account;

public class Main {
    public static void main(String[] args) {
        
        Account[] accounts = {
            new SavingsAccount("SAV001", "Srikar Bingi", 10000.0,200.0),
            new CurrentAccount("CUR001", "Keerthana Thammala", 20000.0, 2000.0),
            new FixedDepositAccount("FD001", "Srikar Bingi", 50000, 6.5, 3)
        };

        for (Account acc : accounts) {
            acc.displayAccountType();
        }

        // acc1.displayAccountDetails();
        // acc1.deposit(1500);
        // acc1.withdraw(2000);
        // acc1.withdraw(6000); // Insufficient balance test
        // acc1.deposit(-100);  // Invalid deposit test

        // if (acc1 instanceof SavingsAccount) {
        //     ((SavingsAccount) acc1).addInterest();
        // }

        // if (acc2 instanceof CurrentAccount) {
        //     ((CurrentAccount) acc2).useOverdraft(1500);
        // }

        FixedDepositAccount fd = (FixedDepositAccount) accounts[2];
        System.out.println("Maturity Amount after 3 years: " + fd.calculateMaturityAmount());
    }
}
