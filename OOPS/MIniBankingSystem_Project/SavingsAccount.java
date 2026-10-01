package OOPS.MIniBankingSystem_Project;

public class SavingsAccount extends Account {
    double interestRate;
    double calculatedInterest;
    SavingsAccount(String accountNumber, int balance, Customer customer, double interestRate, double calculatedInterest ){
        super(accountNumber, balance, customer);
        this.interestRate = interestRate;
        this.calculatedInterest = calculatedInterest;
    }

    void calculateInterestRate(double interestRate){
        calculatedInterest = balance*interestRate/100;
    }

    @Override
    void showAccountDetails(){
        System.out.println("-------------------------This is Saving Account -----------------------");
        System.out.print("Account No. " + accountNumber + " Account Balance " +balance + " Interest rate is " + interestRate + "% and total calculate interest is " + calculatedInterest + " Now total balance with interest is " +(calculatedInterest+balance));
        customer.showCustomerDetails();
    }



}
