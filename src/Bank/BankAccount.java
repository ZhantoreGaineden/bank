package Bank;

public class BankAccount extends BaseAccount {
    private Customer customer;

    public BankAccount(String accountId, Customer customer, double balance) {
        super(accountId, balance);
        this.customer = customer;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        balance -= amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + getAccountId() + '\'' +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
