package OOPS.MIniBankingSystem_Project;

public class Customer {
    String name;
    int custId;
    String phone;

    Customer(String name, int custId, String phone){
        this.name = name; //this is the reference variable that refers to the current object of the class
        this.custId = custId;
        this.phone = phone;
    }

    void showCustomerDetails(){
            System.out.println("---------------- Customer details -----------------");
            System.out.print("\nCustomer Name: "+ name + " \nCustomer ID: " + custId + " \nCustomer Phone no. " + phone);
    }
}
