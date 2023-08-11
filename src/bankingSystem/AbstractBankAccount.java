package bankingSystem;

public abstract class AbstractBankAccount implements BankAccount{
    private double balance;

    public AbstractBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {

        if(amount>0){
            balance+=amount;
        }

    }

    @Override
    public void withdraw(double amount) {

        if(balance>amount && amount>0){
            balance-=amount;
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
