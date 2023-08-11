package bankingSystem;

public class SavingsAccount extends AbstractBankAccount{

    private double interestRate;

    public SavingsAccount(double balance,double interest) {
        super(balance);
        this.interestRate = interest;
    }

    public double calculateInterest(){
        double interest = super.getBalance()*(interestRate/100);
        return interest;
    }
}
