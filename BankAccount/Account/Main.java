package Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("SB123","Srikar Bingi",500.0,5);
        Account acc2 = new CurrentAccount("KT123","Keerthana Thammala",10000.0,1000.0);

        acc1.displayAccountType();
        acc2.displayAccountType();

        acc1.displayAccountDetails();
        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc1.withdraw(6000); // Insufficient balance test
        acc1.deposit(-100);  // Invalid deposit test

        if (acc1 instanceof SavingsAccount) {
            ((SavingsAccount) acc1).addInterest();
        }

        if (acc2 instanceof CurrentAccount) {
            ((CurrentAccount) acc2).useOverdraft(1500);
        }
    }
}
