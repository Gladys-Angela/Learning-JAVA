public class IncrementExample {
    public static void main(String[] args) {
        int counter = 5;

        //Prefix increment (++counter)
        System.out.println("Starting value: " + counter);
        System.out.println("Prefux increment: " + (++counter)); //increses first, then uses
        System.out.println("Current value: " + counter);



        //Postfix increment
        System.out.println("Postfix increment: " + (counter++));
        System.out.println("Current value: "+ counter);

        //Lets see a practicalo example 

        int score = 100;
        System.out.println("\nGame Score Example");
        System.out.println("Initial Score: " + score);//100
        System.out.println("Hit target! Score: " +(++score));//101
        System.out.println("Bonus point pending: " + (score++));//101
        System.out.println("Final score: " + score);//102
    }
    
}
