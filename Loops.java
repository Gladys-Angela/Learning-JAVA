public class Loops {
    public static void main(String[] args) {
        // 1. For Loop - when you know how many times to repeat.
        // syntax
        // for (initialization; condition; update) {
        // code to be exeduted
        // }

        // The for loop has three components.
        // 1 Initialization: Executes once before the loop starts
        // 2. Condition: Evaluated before eachiteration - loop continues while true.
        // 3. Update: Executes after each iteration.

        // Example: Output 1 2 3 4 5
        for (int x = 1; x <= 5; x++){
            System.out.print(x + " ");
        }

        System.out.println();

        // 5 4 3 2 1
        for (int y = 5; y >= 1; y--){
            System.out.print(y + " ");
        }

        System.out.println();

        // 2. while loop - when you don't know how many iterations you need.
        // syntax
        // while (condition) {
        // code block to be executed
        // }

        // the while loop evaluates the condition first;
        // - If the condition is true, the code block is executed and then reevaluates.
        // - If the condition is flase, skips the loop entirely

        // Example: Output 0 1 2 3 4 
        int s = 0;
        while (s < 5){
            System.out.print(s + " ");
            s++;
        }

        System.out.println();

        // Example: 10 8 6 4 2 0
        int w = 10;
        while (w >= 0){
            System.out.print(w + " ");
            w -= 2;
        }

        System.out.println();

        // Example 0 2 4 6 8 10 12 14 16 18
        int r = 0;
        while (r < 20) {
            System.out.print(r + " ");
            r += 2;
        }

        System.out.println();

        // 3. Do-While Loop - when you need to execute at least once.
        // syntax
        // do {
        // code to be executed
        // } while (condition);

        // The do-while loop;
        // - Always executes the code block at least once.
        // - Then evaluates the condition
        // - Continues looping if condition is true.

        // Example: output 1 2 3 4 5 6 7 8 9 10
        int b = 1;
        do {
            System.out.print(b + " ");
            b++;
        } while (b < 11);

        System.out.println();

        // output: 9 8 7 6 5 
        int g = 9;
        do{
            System.out.print(g + " ");
            g--;
        }  while (g >= 5);

        System.out.println();

        // Example: For Loop.
        System.out.println("\nCounting Down To Launch");
        for (int a = 10; a > 0; a--){
            System.out.println("T-minus " + a + " seconds");
        }

        // while loop example
        System.out.println("\nCompound Interest Calculator");
        
        
        double investment = 1000;
        double target = 2000;
        int years = 0;
        double rate = 0.07; // 7% interest rate.

        while ( investment < target) {
            investment *= (1 + rate);
            years++;
            System.out.printf("After year %d $%.2f%n", years , investment);
        }

        System.out.println("It takes " + years + " to double your money");

        // do while loop example
        System.out.println("\nGame Score Generator");
        int score = 0;
        int attempts = 0;

        do{
            // Simulate a game attempt.
            score = (int) (Math.random() * 100);
            attempts++;
            System.out.println("Attempt: " + attempts + " : Score = " + score);
        } while (score < 90); // Keep trying until we get at least 90.
    }
}
