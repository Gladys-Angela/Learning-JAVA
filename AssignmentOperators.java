public class AssignmentOperators {
    //A
//assignment operators let us modify variables in consice ways. Think of th am shortcuts for common operations we perform with variable.
//Let's start with a practical example that demonstrates how assignment operators work in real sitautions
public static void main(String[] args) {
    //simulating a bank account ballance tracker

    double accountBalance = 1000.00; //initial balance


    System.out.println("Banking operations: ");
    System.out.println("Initial Balance: $" + accountBalance);

    //Simple assigment(=)
    //This deposits $500 into the account
    accountBalance = accountBalance + 500;
    System.out.println("Balance after deposit: $" + accountBalance);

    //addition assignment (+=)
    // A faster way to add interest earning

    accountBalance += 50;// same as account balance + 50

    System.out.println("After the interest payment: $" + accountBalance);

    //multiplication (*)
    //5% bonus

    accountBalance *= 1.05;

    System.out.println("After the 5% bonus: $" + accountBalance);

    //Susbtraction assignment(-=)
    //deducting monthly fee
    accountBalance -= 25; //same as accountBalance - 25
    System.out.println("After monthly  deduction: $" + accountBalance);

    //Division assignment(/=)
    //splitting balnce into two accounts
    accountBalance /= 2; //same as accountBalance / 2
    System.out.println("Balance after split: $" + accountBalance);

    System.out.println("====================================");
    //Now lets see how these operators work in more complex scenario involving multiple types of calculations
    //Lets create a score tracking system for a game 

    int playerScore = 100;
    int bonusMultiplier = 2;
    int penaltyPoints = 10;

    System.out.println("Game score Tracking");
    System.out.println("Starting score:" + playerScore);

    //Compount operations with different operators
    playerScore *= bonusMultiplier; // doubles the score
    System.out.println("Score after bons Multiplier: " + playerScore);

    //add bonus points
    playerScore += 50;
    System.out.println("Score after bonus points: "+ playerScore);

    //sbtract penalty

    playerScore -= penaltyPoints;

    System.out.println("Score after penalty: " + playerScore);

    //using multiple operations in expression
    int finalBonus = 25;
    playerScore *= 2 + (finalBonus / 5);

    System.out.println("Final score: " + playerScore);




}


}

//Control flow in java