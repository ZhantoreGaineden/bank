package Bank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private String name;
    private List<BaseAccount> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BaseAccount account) {
        accounts.add(account);
    }


    public List<BaseAccount> filterAccountsByBalance(double minBalance) {
        return accounts.stream()
                .filter(account -> account.getBalance() >= minBalance)
                .collect(Collectors.toList());
    }


    public BaseAccount searchAccountById(String accountId) {
        return accounts.stream()
                .filter(account -> account.getAccountId().equals(accountId))
                .findFirst()
                .orElse(null);
    }

    // Сортировка счетов по балансу
    public List<BaseAccount> sortAccountsByBalance() {
        return accounts.stream()
                .sorted(Comparator.comparingDouble(BaseAccount::getBalance))
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public void displayAccounts() {
        accounts.forEach(System.out::println);
    }
}
