public class ArithmeticExample{
    public static void main(String[] args){
        double itemPrice = 29.99;
        int quantity = 3;
        double taxRate = 0.08;

        //Basic ARITHMETIC
        //multiplication
        double subTotal = itemPrice * quantity;
        double taxAmount = subTotal * taxRate;
        //addition
        double totalPrice = subTotal + taxAmount;

        //Lets see how discount works and apply
        double discountAmount = 10.00;
        //subtraction
        double finalPrice = totalPrice - discountAmount;

        //Display our calculations
        System.out.println("Shopping cart Breakdown");
        System.out.println("Price per item: $" + itemPrice);
        System.out.println("Qunatity: " + quantity);
        System.out.println("Sub Total: $" + subTotal);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Total before discount: $" + totalPrice);
        System.out.println("Final Price after $10 discount: " + finalPrice);

    }


    
}