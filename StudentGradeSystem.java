public class StudentGradeSystem {
    public static void main(String[] args) {
        // Create arrays to store student information.
        String[] studentNames = {"Alice", "Bob", "Charlie", "Diana", "Edward"};
        double[][] grades = {
            {95.5, 88.0, 92.5}, // Alice Grades
            {96.0, 85.0, 90.9}, // Bob Grades
            {91.0, 72.5, 68.0}, // Charles Grades
            {95.0, 95.8, 85.5}, // Diani Grades
            {86.0, 99.0, 98.0} // Edward Grades
        };

        System.out.println("Student Grade Analysis System");
        System.out.println("==============================================");

        // Process each student's grades
        for (int i = 0; i < studentNames.length; i++){
            // Calculate the average grade for this students.
            double studentSum = 0;
            for (int j = 0; j < grades[i].length; j++){
                studentSum += grades[i][j];
            }
            double studentAverage = studentSum / grades[1].length;

            // Display results with detailed formatting.
            System.out.printf("\nStudent: %s%n", studentNames[i]);
            System.out.printf("Individual grades ");                         
            for (double grade : grades[i]){
                System.out.printf("%.1f ,", grade);
            }
            System.out.printf("%nAverage grade: %.1f%n", studentAverage);
        }
    }
}
