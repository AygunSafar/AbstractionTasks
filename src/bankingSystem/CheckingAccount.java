package bankingSystem;

public class CheckingAccount extends AbstractBankAccount {

    private double feeThreshold;
    private double fee;

    public CheckingAccount(double balance,double feeThreshold, double fee) {
        super(balance);
        this.feeThreshold = feeThreshold;
        this.fee = fee;
    }

    public void deductFees() {
        double balance= getBalance();
        if (balance < feeThreshold) {
            balance -=fee;
        }
        System.out.println(balance);
    }
}
