package Bank;

public abstract class BaseAccount {
    private String accountId;
    protected double balance;

    public BaseAccount(String accountId, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.accountId = accountId;
        this.balance = balance;
    }


    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BaseAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        BaseAccount that = (BaseAccount) obj;
        return accountId.equals(that.accountId);
    }

    @Override
    public int hashCode() {
        return accountId.hashCode();
    }
}
