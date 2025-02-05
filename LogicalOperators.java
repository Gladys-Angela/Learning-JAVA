public class LogicalOperators {
    public static void main(String[] args){
        //Logical Operators
        //These operators help combine multiple conditions
        //They're crucial for complex decision-making:
        //And (&&) true if both operands /expressions are true
        //T && T = T
        //T && F = F
        //F && T = F
        //F && F = F
        //OR (||) return true if either of the operand or expressions is true
        //T || T = T
        //T || F = T
        //F || T = T
        //F || F = F
        // Not (!) negates an expression(iF AN EXPRESSION is true, not negates it and it becomes false (denies)
        //!F = T
        //!T = F

        //lets check eligibility for a special program

        int age = 25;
        double gpa = 3.7;
        boolean hasReccomendation = true;

        // Use AND operator
        boolean meetsBasicCriteria = (age >= 18) && (gpa >= 3.5);//true

        //Use OR operator
        boolean hasAlternativeQulification = (gpa >= 3.8) || (hasReccomendation);//true

        //use NOT operator
        boolean isNotEligible = !(meetsBasicCriteria || hasAlternativeQulification);//false

        System.out.println("Program Eligibility Check: " + meetsBasicCriteria);
        System.out.println("Has alternative qualification: " + hasAlternativeQulification);
        System.out.println("Is not eligible: " + isNotEligible);
        


    }
}
