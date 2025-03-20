// Write a java program to display the following input dialog: 

package Tests;
import javax.swing.JOptionPane;

public class AccountInfoDialog {
    public static void main(String[] args) {
        // Display input dialog
        String accountNumber = JOptionPane.showInputDialog(null, 
            "please enter your account number", 
            "Account information", 
            JOptionPane.INFORMATION_MESSAGE);
        
        // Display confirmation message (optional)
        // if (accountNumber != null) {
        //     JOptionPane.showMessageDialog(null, 
        //         "You entered: " + accountNumber, 
        //         "Confirmation", 
        //         JOptionPane.INFORMATION_MESSAGE);
        // }
    }
}
