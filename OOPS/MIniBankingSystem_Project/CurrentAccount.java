package OOPS.MIniBankingSystem_Project;

public class CurrentAccount extends Account {
    int transactionFee;

    CurrentAccount(String accountNumber, int balance, Customer customer, int transactionFee ){
        super(accountNumber,balance,customer);
        this.transactionFee = transactionFee;
    }
    
    @Override 
    void showAccountDetails(){
        System.out.println("-----------------------lThis is Current Account --------------------");
        super.showAccountDetails();
        System.out.print(" Transaction fees for current Account is " + transactionFee);
    }



}
