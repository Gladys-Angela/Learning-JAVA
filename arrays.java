// public class arrays {
//     public static void main(String[] args) {
//         // Arrays In Java
//         // Think of an array like an organized shelf in a library - it holds multiple items of the same type,
//         // and each item has its specific position (or index).
//         // Let's start with the basics and gradually work our way to more sophisticated uses.

//         System.out.println("Understanding Arrays In Java");
//         System.out.println("=================================");

//         //Creating Arrays - imagine setting up shelves in our library
//         // syntax: dataType[] arrayName = new dataType[size]

//         int[] numbers = new int[5]; // Create space for 5 integers.
//         String[] books = new String[3]; //Create space for 3 book titles.
//         double[] temperatures = {98.6, 97.9, 98,0, 97.8};

//         // Let's explore how to work with these arrays.
//         System.out.println("\nPopulating and Reading Arrays:");

//         // Access Elements in an Array.
//         // syntax: arrayName[element_index]
//         // Access the first element of temperatures.
//         System.out.println(temperatures[0]); // 98.6
//         System.out.println(temperatures[1]); // 97.9

//         // Insert a value in numbers
//         numbers[0] = 10;
//         numbers[1] = 15;
//         numbers[2] = 25;
//         System.out.println(numbers[0]); // 10
//         System.out.println(numbers[2]); // 25

//         for (int i = 0; i < numbers.length; i++){
//             numbers[i] = i * 2;
//             System.out.println("position " + i + " contains " + numbers[i]);
//         }

//         // Let's create a pratical example with temperature tracking.
//         System.out.println("\nTemperature Analysis:");

//         // Calculate the average temperature.
//         double sum = 0;
//         for (double temp : temperatures){
//             sum = sum + temp;
//         }
//         double average = sum / temperatures.length;

//         System.out.printf("Average temperature: %.1f°F%n", average);

//         // Now, let's look at a more complex exampl that demonstrates practical uses of arrays. StudentGradeSystem.java
//     }
// }
