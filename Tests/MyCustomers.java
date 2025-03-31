package Tests;
import java.util.Scanner;
public class MyCustomers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] customerDetails = new String[2];

        System.out.print("Enter your name: ");
        customerDetails[0] = scanner.next();
        System.out.print("Enter item ordered: ");
        customerDetails[1] = scanner.next();

        System.out.print("name: " + customerDetails[0] + " " + "Item ordered: " + customerDetails[1]);
        

        scanner.close();
        
        
        



    }
    
}
