// Mrs. Amina, a class six teacher gave out an end of term exam to her pupils. Her class has 
// thirty-eight (38) pupils. For each score, a pupil can be graded as A, B,C,D and E 
// according to the criteria below. 
// Score grade
// <=39    E 
// >=40 and <=49 D
// >=50 and <=59 C
// >=60 and <=69 B
// >=70 and <=100 A 
// Write a java program to read all the 38 scores then grade them and display the scoresheet. 
// Hint: The program does not need to read the names of pupils.
package Tests;

public class ScoreTest {
    public static void main(String[] args){
        //predefined scores
        int[] scores = {78, 45, 56, 20, 88, 67, 99, 45, 100, 33,
                        47, 50, 41, 37, 69,42, 95,64, 31,80,74,
                        64, 72, 13, 67, 44, 100, 61, 20, 36,
                    23, 77, 48, 6, 90, 24, 52, 68};
    
    //Display scoresheet
    System.out.println("\nSCORESHEET");
    System.out.println("Pupil No. \tScore\tGrade");
    
    for(int i = 0; i < scores.length; i++){
        char grade;
        int score = scores[i];

        //Determine grade using direct logic
        if (score <= 39){
            grade = 'E';
        } else if(score <= 49){
            grade = 'D';
        } else if(score <=59){
            grade = 'C';
        } else if(score <= 69){
            grade = 'B';

        } else {
            grade = 'A';
        }
        //print scoresheet

        System.out.println((i + 1) + "\t\t" + score + "\t" + grade);

    }
    

    

    }
}
