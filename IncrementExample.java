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
    }
    
}
