// Mrs. Amina, a class six teacher gave out an end of term exam to her pupils. Her class has 
// thirty-eight (38) pupils. For each score, a pupil can be graded as A, B,C,D and E 
// according to the criteria below. 
// Score | grade 
// <=39    E 
// >=40 and <=49 D 
// >=50 and <=59 C 
// >=60 and <=69 B
// >=70 and <=100 A 

// Write a java program to read all the 38 scores then grade them and display the scoresheet. 
// Hint: The program does not need to read the names of pupils. 
 



package Tests;
public class GradeSy {
    public static void main(String[] args){
        int[] scores = {28, 46, 38, 78, 99, 68, 58, 20, 40, 78, 89, 23, 4, 65, 79, 89, 56, 32, 93, 56,23, 53, 78, 21, 12, 34, 45, 56, 78, 89, 97, 65, 43, 24, 57, 85,61, 53};
        char grade;
    
        System.out.println("Mrs.Amina Class Grading system");
        System.out.println("===================================================");


        for(int i = 0; i < scores.length; i++){
            if (scores[i] <= 39){
                grade = 'E';
            } else if ( scores[i] <= 49){
                grade = 'D';
            } else if ( scores[i] <= 59){
                grade = 'C';
            } else if ( scores[i] <= 69){
                grade = 'B';
            } else {
                grade = 'A';
            }
            System.out.println("Student " + (i + 1) + " | Score: " + scores[i] + " | Grade: " + grade);


        }
    
    
    
    }
}
