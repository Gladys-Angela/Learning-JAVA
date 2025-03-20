// Write a class named employee that instantiates a kcau_emp object from the class you 
// created. Prompt the user to enter personal details such as id no, name, occupation and 
// then display all the values entered by the user. 
 package Tests;

import java.util.Scanner;

public class kcau_emp {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your id no: ");
        int no = scanner.nextInt();
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your occupation: ");
        String occupation = scanner.next();


        System.out.println("Id no: " + no);
        System.out.println("Name: " + name);
        System.out.println("Occupation: " + occupation);

        scanner.close();

    

    }
}
