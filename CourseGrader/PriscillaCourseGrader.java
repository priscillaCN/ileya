import java.util.Scanner;
import java.util.Arrays;

public class PriscillaCourseGrader {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("\nEnter number of students enrolled");
        int numberOfStudents = userInput.nextInt();

        System.out.println("Enter number of quizzes taken");
        int numberOfQuizzes = userInput.nextInt();

        double quizScore = 0;
        int row = 0;
        double total = 0;

        double [][] gradesPerStudent = new double [numberOfStudents][numberOfQuizzes];
        double [] studentAverage = new double [numberOfStudents];

        for(int studentIndex = 0; studentIndex < gradesPerStudent.length; studentIndex++) {
            System.out.println("\n--- student " + (studentIndex + 1) + " ---" );

            for(int gradeIndex = 0; gradeIndex < gradesPerStudent[studentIndex].length; gradeIndex++) {

                System.out.print("Score for quiz " + (gradeIndex + 1) + ":  ");
                quizScore =  userInput.nextInt();
                
                while (quizScore < 0 || quizScore > 100) {

                    System.out.print("invalid score\n");

                    System.out.print("Score for quiz " + (gradeIndex + 1) + ":  ");
                    quizScore =  userInput.nextInt();

                }

                gradesPerStudent[studentIndex][gradeIndex] = quizScore;
                total += quizScore;

            }

            studentAverage[studentIndex] = total / numberOfQuizzes;
            total = 0;
        }

        System.out.println("\n========== QUIZ GRADE REPORT ===========");

        System.out.print("STUDENT\t\t");

        for(int gradeIndex = 0; gradeIndex < numberOfQuizzes; gradeIndex++) {

            System.out.print("QUIZ " + (gradeIndex + 1) + " \t");

        }

        System.out.print("AVG\n");

        for(int studentIndex = 0; studentIndex < gradesPerStudent.length; studentIndex++) {
            System.out.print("student " + (studentIndex + 1) + " \t");

            for(int gradeIndex = 0; gradeIndex < gradesPerStudent[studentIndex].length; gradeIndex++) {
                System.out.printf("%5.2f", gradesPerStudent[studentIndex][gradeIndex]);
            }

            System.out.printf("%20.2f %n", studentAverage[studentIndex]);

        }

        double quizTotal = 0;

        for(int gradeIndex = 0; gradeIndex < gradesPerStudent.length; gradeIndex++) {

            for(int studentIndex = 0; studentIndex < gradesPerStudent[gradeIndex].length; studentIndex++) {

                quizTotal += gradesPerStudent[gradeIndex][studentIndex];

            }
            
            double quizAverage = quizTotal / numberOfStudents;
        
            System.out.println("QUIZ " + (gradeIndex + 1) + " AVERAGE: " + quizAverage);

            quizTotal = 0;

        }
       
        
    }

}
