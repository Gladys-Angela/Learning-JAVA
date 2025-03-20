// Write a java program to receive two string values then using StringBuilder class do the following: 
// Reverses characters in the first string 
//  Insert characters “abc” in the first string 
// Concatenate thee two strings
package Tests;

import java. util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String str1 = scanner.next();
        System.out.print("Enter second string: ");
        String str2 = scanner.next();

        //Using StringBuilder
        StringBuilder sb = new StringBuilder(str1);

        //reverse the first string 
        sb.reverse();
        System.out.println("Reversed first String: "+ sb);

        //insert "abc" at index 2 in the first string
        sb.insert(0,"abc");
        System.out.println("After inserting 'abc': " + sb);

        //concatenation both strings
        String result = sb.toString() + str2;
        System.out.println("Concatenated result: " + result);

        scanner.close();
        



    }
}
