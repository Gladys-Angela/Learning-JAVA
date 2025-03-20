// In a bank account management system, the details such as account number, account name, deposits 
// and withdrawal are to be captured by the system. Write a java program to use two class methods- 
// getAccountDetails () and Display (). The method getAccountDetails () will get values of account 
// number, account name, deposits and withdrawal through the keyboard for three customers. The 
// Display () method will calculate and display account number, account name, deposits, withdrawal and 
// balance for the three customers. Hint balance=deposit-withdrawal.
package Tests;
import java.util.Scanner;

public class BankAccount {
    String accountNumber, accountName;
    double deposit, withdrawal, balance;
    
    void getAccountDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account Number: ");
        accountNumber = scanner.next();
        System.out.print("Enter account Name: ");
        accountName = scanner.next();
        System.out.print("Enter Deposit amount: ");
        deposit = scanner.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        withdrawal =  scanner.nextDouble();
        balance = deposit - withdrawal;
        scanner.close();
    }
    void display(){
        System.out.println("\nAccount Details:");
        System.out.println("account Number: " + accountNumber);
        System.out.println("account Name: " + accountName);
        System.out.println("Deposit amount: " + deposit);
        System.out.println("Withdrawal: " + withdrawal);
        System.out.println("Balance: " + balance);

        
    }
}
