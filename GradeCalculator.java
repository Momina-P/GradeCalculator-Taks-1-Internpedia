import java.util.Scanner;
public class GradeCalculator {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input the marks obtained each subject

        System.out.print ("Enter your number of subjects:" );
         int numSubjects = scanner.nextInt();
         double[]marks = new double[numSubjects];
         double totalMarks = 0;

         for(int i = 0; i<numSubjects; i++) {
            System.out.print("Enter marks for subject" + (i + 1 ) + ":");
            marks[i] = scanner.nextDouble();
            totalMarks += marks [i];

         }

         double averagePercentage = totalMarks / numSubjects;
         char grade;

         if (averagePercentage >= 90) {
            grade = 'A';
         } else if (averagePercentage >=80) {
            grade = 'B';
         } else if ( averagePercentage >= 70) {
            grade  = 'C';
         } else if (averagePercentage >= 60) {
            grade = 'D';
         } else {
            grade = 'F';
         }

         // Display to the user the total marks
         System.out.println("Total Marks:" + totalMarks);
         System.out.println("Average Percentage:" + averagePercentage);
         System.out.println("Final Grade" + grade);
        
    }
}