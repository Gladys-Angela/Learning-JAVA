
public class Expression {
    public static void main(String[] args){
        //Understanding type conversion in expressions

        int intValue = 5;
        double doubleValue = 2.5;

        //mixed type operations
        double result = intValue + doubleValue;
        System.out.println("Integer + Double " + result);

        //Integer division vs Double division
        System.out.println("\nDivision Examples");
        System.out.println("Integer Division(5/2): " + (5/2));
        System.out.println("Double Division Examples(5.0/2): " + (5.0/2));

        //Complex expressions with multiple operations 
        double complexResult = (intValue * doubleValue) + (10 /3.0 );
        System.out.println("\ncomplex calculation result: " + complexResult);
        //understanding operator precedence

        int precedenceExample = 10 + 5 * 2;
        System.out.println("\nOperator precedence example: " + precedenceExample);

        //using parentheses to control order of operations

    int withParentheses = (10 + 5) * 2;
    System.out.println("Same expression with parantheses: " + withParentheses);

    //example : complex expression
    int x = 5, y = 3, z = 2;
    int complxResult = x + y * z - x / y;
    System.out.println("\nComplex expression result: " + complxResult);
    //breaking down the 
    System.out.println("Step by step");
    System.out.println("1. y * z = " + y * z);
    System.out.println("2. x / y = " + x / y);
    System.out.println("3. x + (y * z) - (x / y) = " + complxResult);




    }
    
}
