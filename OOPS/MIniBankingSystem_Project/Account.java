package OOPS.MIniBankingSystem_Project;

public class Account {
    String accountNumber;
    int balance;
    Customer customer;

    Account(){
        balance = 100; // by default
    }// ; is not mendatory after constructor
    Account(String accountNumber){
        this();
        this.accountNumber = accountNumber;
    } // ; is not mendatory after constructor
    Account(String accountNumber, int balance, Customer customer ){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    } // ; is not mendatory after constructor
    

    void deposit(int deposit){
        balance+= deposit;
        System.out.println("You deposited " + deposit + " Now total balance is "+ balance );
    }

    void withdraw(int withdeaw){
        balance-=withdeaw;
        System.out.print("You withdraw "+ withdeaw + " Now your total balance is "+ balance);
    }

    void showBalance(){
        System.out.println("Your Balance is " + balance);
    }

    void showAccountDetails(){
        System.out.print("Account No. " + accountNumber + " Account Balance " +balance + " customer is");
        customer.showCustomerDetails();
    }

    
}
