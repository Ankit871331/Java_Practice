package OOPS.MIniBankingSystem_Project;

public class Main {
    public static void main(String[] args) {

        // Create Bank object
        Bank bank = new Bank();

        // Create Customer objects
        Customer customer1 = new Customer("Ankit", 121, "5555555555");
        Customer customer2 = new Customer("Rahul", 122, "6666666666");

        // Add customers to Bank
        bank.addCustomers(customer1);
        bank.addCustomers(customer2);

        // Create SavingsAccount
        SavingsAccount savingsAccount =
                new SavingsAccount("SA101", 5000, customer1, 5.0, 0);

        // Create CurrentAccount
        CurrentAccount currentAccount =
                new CurrentAccount("CA101", 10000, customer2, 20);

        // Add accounts to Bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Display all accounts
        bank.displayAccounts();
    }
}
