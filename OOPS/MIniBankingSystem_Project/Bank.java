package OOPS.MIniBankingSystem_Project;
import java.util.*;

public class Bank {
    
    List<Customer>customers = new ArrayList<>();
    List<Account>accounts = new ArrayList<>();

    void addCustomers(Customer customer){
        customers.add(customer);
    }

    void addAccount(Account account){
        accounts.add(account);
    }


    void displayAccounts(){
        for(Account account: accounts){
            account.showAccountDetails();
            System.out.println();
        }
    }



    }


