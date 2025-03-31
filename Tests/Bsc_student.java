package Tests;
import java.util.Scanner;

public class Bsc_student {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id number: ");
        int idno = scanner.nextInt();
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Course: ");
        String course = scanner.next();

        // System.out.println("Id number: " + idno);
        // System.out.println("Name: " + name);
        // System.out.println("Course: " + course);
        System.out.println("Id number: " + idno + " " + "Name: " + name + " " + "Course: " + course);
    
        scanner.close();

    
    }
}
    