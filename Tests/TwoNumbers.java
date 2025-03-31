package Tests;
import java.util.Scanner;
public class TwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        double average = sum / 2;

        System.out.println("num1:num2 " + num1 + num2 + "The sum of two numbers: " + sum + " " + "The average of the two numbers: " + average);
        scanner.close();


    }
    
}
