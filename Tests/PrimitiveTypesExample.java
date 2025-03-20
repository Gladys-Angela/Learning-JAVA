package Tests;
public class PrimitiveTypesExample {
    public static void main (String[] args) {
        // Integer Types (Whole Numbers)
        byte smallNumber = 127;                     // 8-bit, range: -128 to 127
        short mediumNumber = 32000;                 // 16-bit, range: -32,768 to 32,767
        int standardNumber = 2000000;               // Most commonly used for whole numbers
        long largeNumber = 9223372036854775807L;    // For very large numbers

        // Floating-Point Types (Numbers with decimal points)
        float simpleDecimal = 3.14f;                // 7 decimal digits precision
        double preciseDecimal = 3.141592653589793;  // 15 decimal digits

        // Character Type
        char singleCharacter = 'A';                 // Stores a single character

        // Boolean Type
        boolean isJavaFun = true;                   // Can only be true or false

        // Printing values to see their behavior
        System.out.println("Working with numbers");
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + mediumNumber);
        System.out.println("Integer value: " + standardNumber);
        System.out.println("Long value: " + largeNumber);

        // print the floats, character, boolean
        System.out.println("Float value: " + simpleDecimal);
        System.out.println("Double value: " + preciseDecimal);

        System.out.println("Character: " + singleCharacter);

        System.out.println("Boolean value: " + isJavaFun);


        // Demonstrating Arithmetic 
        int sum = standardNumber + mediumNumber;
        System.out.println("Sum: " + sum);

        // Next Class/Week -> Understanding Type Constraints
        // Create a new file TypeConstraints.java
    }
}
