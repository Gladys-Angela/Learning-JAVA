package Tests;
import java.util.Scanner;

public class listItems{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int choice;

do {
    System.out.println("Hotel Menu");
    System.out.println("1. Breakfast");
    System.out.println("2. Lunch");
    System.out.println("3. Dinner");
    System.out.println("4. Exit");
    choice = scanner.nextInt();
} while (choice != 4);
    }
   
}

