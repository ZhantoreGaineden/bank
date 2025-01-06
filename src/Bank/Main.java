package Bank;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice", "C001");
        Customer customer2 = new Customer("Bob", "C002");
        Customer customer3 = new Customer("Charlie", "C003");

        BankAccount account1 = new BankAccount("A001", customer1, 1500);
        BankAccount account2 = new BankAccount("A002", customer2, 2000);
        BankAccount account3 = new BankAccount("A003", customer3, 500);

        Bank bank = new Bank("MyBank");
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);


        System.out.println("Accounts with balance >= 1000:");
        bank.filterAccountsByBalance(1000).forEach(System.out::println);


        System.out.println("\nSearch for account A002:");
        System.out.println(bank.searchAccountById("A002"));


        System.out.println("\nAccounts sorted by balance:");
        bank.sortAccountsByBalance().forEach(System.out::println);
    }
}
