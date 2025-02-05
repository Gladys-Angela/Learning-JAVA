import javax.swing.plaf.synth.SynthStyle;

public class ComparisonOperators {
    public static void main(String[] arg) {
        //comparison operators in java
        //These operators compare  values and return boolean values results
        //They are essentials in decison making in the programs
        //less than <
        //greater than >
        //Equals to ==
        //Not equal to !=
        //less than or equal to <=
        // Greater than or equal to >=

        //lets create a simple grading system
        int studentScore = 85;
        int passingScore = 70;
        int distinctionScore = 90;

        //Using comparison operators
        boolean hasPassed = studentScore >= passingScore;
        boolean hasDistinction = studentScore >= distinctionScore;
        boolean needsImprovement = studentScore < passingScore;
    
        //checking for exact score,
        boolean isPerfect = studentScore == 100;
        boolean isNotPerfect = studentScore != 100;

        //Display results
        System.out.println("Student Grade analysis: ");
        System.out.println("Student score: " + studentScore);
        System.out.println("Passed? " + hasPassed);
        System.out.println("Earned distinction: " + hasDistinction);
        System.out.println("Needs Improvement? " + needsImprovement);
        System.out.println("Perferct score? " + isPerfect);
    }
    

}
