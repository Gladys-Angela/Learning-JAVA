package Tests;


public class BankApp {
    public static void main (String[] args) {
        BankAccount[] accounts = new BankAccount[3];
        
        for (int i = 0; i < 3; i++){
            System.out.println("\nEnter details for customer " + (i + 1) + ":");
            accounts[i] =  new BankAccount();
            accounts[i].getAccountDetails();
        }
        System.out.println("\nAccount Details: ");
        for (BankAccount account : accounts){
            account.display();
        }
    }
}

